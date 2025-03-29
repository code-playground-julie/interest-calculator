FROM gradle:8.13.0-jdk21
EXPOSE 80
VOLUME [ "/opt/src" ]
WORKDIR /opt/src
RUN echo "=== Checking /opt/src directory ===" && ls -al /opt/src && echo "=== Done ==="

# ENTRYPOINT ["./gradlew", "build", "bootRun"]
ENTRYPOINT ["/bin/bash", "-c", "./gradlew build && ./gradlew bootRun"]