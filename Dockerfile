FROM openjdk:17
ADD target/sbmysql-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]