FROM amazoncorretto:8
MAINTAINER paula
COPY target\paula-0.0.1-SNAPSHOT.jar paula-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/paula-0.0.1-SNAPSHOT.jar"]