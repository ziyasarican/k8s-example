FROM openjdk:19
EXPOSE 8080
ADD target/k8s-example-0.0.1-SNAPSHOT.jar k8s-example-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/k8s-example-0.0.1-SNAPSHOT.jar"]