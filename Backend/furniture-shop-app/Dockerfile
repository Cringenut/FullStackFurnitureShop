# Build stage
FROM maven:3.8.3-openjdk-17 AS build

# Set the working directory
WORKDIR /home/app

# Copy only the pom.xml file first and download dependencies
COPY pom.xml .
RUN mvn dependency:go-offline

# Now copy the source code
COPY src ./src

# Build the application
RUN mvn clean package -DskipTests

# Run stage
FROM openjdk:17-jdk-slim

# Copy the built JAR from the build stage
COPY --from=build /home/app/target/*.jar /app/app.jar

# Expose the application port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
