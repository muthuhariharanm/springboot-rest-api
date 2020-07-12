FROM maven:3.6.3 as builder
COPY . /usr/src/build
WORKDIR /usr/src/build
RUN mvn verify

FROM openjdk:8-jdk-alpine
COPY --from=builder /usr/src/build/target/*.jar app.jar
EXPOSE 7070
ENTRYPOINT ["java","-jar","/app.jar"]
