FROM amazoncorretto:8-alpine-jdk
COPY target/Backend-0.0.1-SNAPSHOT.jar Backend.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","Backend.jar"]
