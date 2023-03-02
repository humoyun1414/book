FROM eclipse-temurin:18-jdk-alpine

COPY build/libs/euroclimate-0.0.1-SNAPSHOT.jar /euroclimate.jar

EXPOSE 8081:8081

ENTRYPOINT ["sh", "-c", "java -jar /euroclimate.jar"]



