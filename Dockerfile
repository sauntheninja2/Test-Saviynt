FROM openjdk:11
MAINTAINER Sujay Saundatti
COPY target/Test-Saviynt-0.0.1-SNAPSHOT.jar  Saviynt-Test-0.0.1.jar
ENTRYPOINT ["java" , "-jar" , "/Saviynt-Test-0.0.1.jar"]