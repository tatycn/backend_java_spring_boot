FROM openjdk:11-bullseye
VOLUME /tmp
ADD build/libs/*.jar /app.jar
COPY build/resources/main/static /jar_resources/static
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","/app.jar"]