<<<<<<< HEAD
FROM amazoncorretto:8
MAINTAINER C14F4
COPY target/portfolio-0.0.1-SNAPSHOT.jar portfolio-0.0.1-SNAPSHOT.jar
=======
FROM amazoncorretto:8
MAINTAINER C14F4
COPY target/portfolio-0.0.1-SNAPSHOT.jar portfolio-0.0.1-SNAPSHOT.jar
>>>>>>> 1f28036385d5849b75f861f123588cfceeefdbab
ENTRYPOINT ["java","-jar","/portfolio-0.0.1-SNAPSHOT.jar"]