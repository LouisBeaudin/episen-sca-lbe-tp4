FROM openjdk:8-jdk-alpine as build
COPY target/*.jar episen-sca-lbe-backend.jar

FROM openjdk:8-jre-alpine
RUN addgroup -S louis && adduser -S louis -G louis
USER louis
LABEL maintainer="louisbeaudin@outlook.fr"
LABEL datepublish="19/11/2020"
# copy only the built jar and nothing else
COPY --from=build /episen-sca-lbe-backend.jar /

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "episen-sca-lbe-backend.jar"]
