FROM openjdk:8-jdk-alpine as build
COPY . /app
RUN cd /app && ./gradlew bootJar

FROM openjdk:8-jre-alpine
COPY --from=0 /app/build/libs/kubernetes-strta-demo-0.0.1-SNAPSHOT.jar /app/kubernetes-strta-demo-0.0.1-SNAPSHOT.jar
CMD java -jar /app/kubernetes-strta-demo-0.0.1-SNAPSHOT.jar
