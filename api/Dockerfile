FROM gradle:8.13.0-jdk21
WORKDIR /app
COPY . .
RUN gradle build
ENTRYPOINT ["gradle","bootRun"]