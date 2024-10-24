FROM maven:3.8.3-amazoncorretto-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -Dmaven.test.skip=true
FROM amazoncorretto:17-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar ./app.jar
CMD ["java", "-jar", "app.jar"]
