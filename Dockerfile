FROM openjdk:8-jre-alpine

MAINTAINER support@cashlight.io
RUN apk add --update curl && rm -rf /var/cache/apk/*    
RUN echo "Creating vac-config service..."
RUN echo "Deleting artifacts directory..."
RUN rm -rf app/
RUN echo "Creating artifacts directory..."
RUN mkdir -p app/
RUN ls -la
WORKDIR /app
RUN ls -la
RUN echo "Copying JAR file..."
COPY /target/*.jar vac-config.jar

ENTRYPOINT ["java", "-Xmx1024m", "-Xms256m", "-jar", "/app/vac-config.jar"]