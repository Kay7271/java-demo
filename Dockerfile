FROM openjdk:8-jdk-slim
LABEL maintainer=kay

COPY target/*.jar /app.jar

ENTRYPOINT ["java","-jar","/app.jar"]