FROM ubuntu:16.04
FROM openjdk:8-jre-alpine
COPY target/java-secondDay-assignments-1.0-SNAPSHOT.jar /java-secondDay-assignment.jar
ENTRYPOINT exec java $* -jar /java-secondDay-assignment.jar
