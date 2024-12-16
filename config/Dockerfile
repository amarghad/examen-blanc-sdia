FROM maven:3.9.9-eclipse-temurin-21-jammy
# About
LABEL authors="Ayoub Marghad"

WORKDIR /app

COPY . .

RUN mvn install -DskipTests -Dmaven.install.skip=true

EXPOSE 8888

CMD ["mvn", "spring-boot:run"]