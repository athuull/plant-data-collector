FROM arm64v8/openjdk:17-ea-32-jdk

COPY target/plant-data-collector-0.0.1-SNAPSHOT.jar /app.jar

ENTRYPOINT ["java" , "-jar" , "app.jar"]

 