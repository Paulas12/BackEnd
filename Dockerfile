FROM amazoncorretto:8
MAINTAINER paula
COPY target\paula-0.0.1-SNAPSHOT.jar.original paula-0.0.1-SNAPSHOT.jar.original
ENTRYPOINT ["java","-jar","/paula-0.0.1-SNAPSHOT.jar.original"]