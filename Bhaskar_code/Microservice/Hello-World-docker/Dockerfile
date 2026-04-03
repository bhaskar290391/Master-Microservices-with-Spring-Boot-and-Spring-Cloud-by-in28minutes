FROM openjdk:26-ea-21-jdk-slim-trixie
COPY target/*.jar app.jar
EXPOSE 5000
ENTRYPOINT ["java","-jar","/app.jar"]