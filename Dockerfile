FROM  amazoncorretto:8                                  //imagen de java de la que partimos 
MAINTAINER  paula                                       //dueño de la imagen 
COPY  target/paula-0.0.1-SNAPSHOT.jar  paula-app.jar    //copia de nuestra maquina el empaquetado y lo sube 
ENTRYPOINT  ["java","jar-","/paula-app.jar"]            //una vez que se crea el empaquetado, esta instruccion es la que se ejecuta primero
