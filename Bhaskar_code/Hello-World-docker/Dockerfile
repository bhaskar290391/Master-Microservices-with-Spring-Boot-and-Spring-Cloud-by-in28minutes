#FROM openjdk:26-ea-21-jdk-slim-trixie
#COPY target/*.jar app.jar
#EXPOSE 5000
#ENTRYPOINT ["java","-jar","/app.jar"]


FROM maven:3.9.11-amazoncorretto-25-alpine AS build
WORKDIR /home/app

COPY ./pom.xml /home/app/pom.xml
COPY ./src/main/java/com/in28minutes/rest/webservices/restfulwebservices/RestfulWebServicesApplication.java	/home/app/src/main/java/com/in28minutes/rest/webservices/restfulwebservices/RestfulWebServicesApplication.java

RUN mvn -f /home/app/pom.xml clean package

COPY . /home/app
RUN mvn -f /home/app/pom.xml clean package

FROM openjdk:26-ea-21-jdk-slim-trixie
EXPOSE 5000
COPY --from=build /home/app/target/*.jar app.jar
ENTRYPOINT [ "sh", "-c", "java -jar /app.jar" ]