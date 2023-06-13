FROM gradle:latest AS BUILD
WORKDIR /usr/app/
COPY . .
RUN gradle build

FROM eclipse-temurin:17-jdk-alpine
ENV JAR_NAME=app.jar
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY --from=BUILD $APP_HOME .
EXPOSE 8080
ENTRYPOINT ["java","-jar","/build/libs/recursos-0.0.1-SNAPSHOT.jar"]

#FROM eclipse-temurin:17-jdk-alpine
#COPY build/*.jar app.jar
#ENTRYPOINT ["java","-jar","/build/libs/recursos-0.0.1-SNAPSHOT.jar"]
#EXPOSE 8080