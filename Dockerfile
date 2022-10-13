FROM maven:3.5-jdk-8 as maven
COPY ./pom.xml ./pom.xml
COPY ./src ./src
RUN mvn package -DskipTests

FROM openjdk:8-jdk-alpine
COPY --from=maven target/SoftPos-0.0.1-SNAPSHOT.war app.war
EXPOSE 8080 8081
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.war"]
