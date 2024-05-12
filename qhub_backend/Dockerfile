FROM gradle:jdk21 AS build
COPY . .
RUN ./gradlew build

FROM openjdk:21-slim
COPY --frombuild build/libs/qhub_backend-1.jar qhub_backend.jar

EXPOSE 8080
ENTRYPOINT ["java","-jar","qhub_backend.jar"]
