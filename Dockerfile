FROM  amazoncorretto:11-alpine-jdk
MAINTAINER paula
COPY target/paula-0.0.1-SNAPSHOT.jar  paula-app.jar
ENTRYPOINT  ["java","-jar","/paula-app.jar"]     