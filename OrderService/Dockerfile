FROM openjdk:17-alpine
WORKDIR /app
COPY target/OrderService-0.0.1-SNAPSHOT.war /app/OrderService.war
CMD ["java", "-jar", "/app/OrderService.war"]