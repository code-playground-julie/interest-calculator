FROM gradle:8.13.0-jdk21
WORKDIR /app
COPY api .
RUN gradle build --parallel
ENTRYPOINT ["gradle","bootRun"]