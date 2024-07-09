FROM openjdk:17-alpine
WORKDIR /app
COPY target/UserService-0.0.1-SNAPSHOT.war /app/UserService.war
CMD ["java", "-jar", "/app/UserService.war"]