FROM openjdk:8-jdk-alpine
EXPOSE 9051
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
ADD ./target/hello-world-microservice.jar hello-world-microservice.jar
ENTRYPOINT ["java","-jar","/hello-world-microservice.jar"]