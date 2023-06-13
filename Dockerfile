FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY build/*.jar app.jar
ENTRYPOINT ["java","-jar","/build/libs/recursos-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080