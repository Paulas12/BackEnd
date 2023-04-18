FROM amazoncorretto:8-alpine-jdk
MAINTAINER paula
COPY target/paula-0.0.1-SNAPSHOT.jar  paula-app.jar
ENTRYPOINT  ["java","-jar","/paula-app.jar"]     