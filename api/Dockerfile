FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/forSummerPractise-0.0.1-SNAPSHOT.jar
WORKDIR /app
EXPOSE 5000
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]
