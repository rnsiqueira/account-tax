FROM openjdk:11-jre
ARG JAR_FILE=build/libs/accounting-tax-1.0.1.jar
COPY ${JAR_FILE} app.jar
CMD ["java","-jar","/app.jar"]