FROM openjdk:8-jdk-alpine
COPY target/*.jar episen-sca-lbe-backend.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "episen-sca-lbe-backend.jar"]
