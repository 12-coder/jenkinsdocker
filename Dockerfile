FROM java:8-jdk-alpine

COPY ./target/spring-db-0.0.1-SNAPSHOT.jar /app/

WORKDIR /app

RUN sh -c 'touch spring-db-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","spring-db-0.0.1-SNAPSHOT.jar"]

