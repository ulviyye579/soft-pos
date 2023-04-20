FROM gitlab.unibank.lan:4567/devops/image:maven-3.5-jdk-11-slim as maven
COPY ./pom.xml ./pom.xml
COPY ./src ./src
COPY .m2/settings.xml /root/.m2/settings.xml
RUN mvn package -DskipTests

FROM gitlab.unibank.lan:4567/devops/image:openjdk-11-jdk-slim
COPY --from=maven target/SoftPos-0.0.1-SNAPSHOT.war app.war
EXPOSE 8080 8081
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.war"]

