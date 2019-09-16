FROM openjdk:8
ADD target/database-jpa.jar database-jpa.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","database-jpa.jar"]