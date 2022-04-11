FROM mysql:latest AS mysql_banco
ENV MYSQL_DATABASE banco
COPY ./sql-script/ /docker-entrypoint-initdb.d/

FROM openjdk:latest AS rest_service
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]