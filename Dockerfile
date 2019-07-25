FROM openjdk:8
ADD target/demo-application.jar demo-application.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "demo-application.jar"]