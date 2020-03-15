FROM ubuntu:16.04
FROM openjdk:8-jre-alpine
COPY /var/lib/jenkins/workspace/parse-data/target/java-secondDay-assignments-1.0-SNAPSHOT.jar /java-secondDay-assignments-1.0-SNAPSHOT1.war
CMD ["/usr/bin/java", "-Xmx256m -jar", "/app.war"]