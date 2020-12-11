FROM gradle:jdk11

COPY --chown=gradle:gradle . /app
WORKDIR /app
RUN gradle build

EXPOSE 8080
WORKDIR /app

CMD java -jar build/libs/customerservicedesk-1.0.0.jar