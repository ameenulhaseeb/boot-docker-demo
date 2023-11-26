FROM openjdk:17
EXPOSE 8080
ADD target/boot-docker-demo.jar boot-docker-demo.jar
ENTRYPOINT ["java","-jar","/boot-docker-demo.jar"]
