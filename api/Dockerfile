FROM gradle:8.13.0-jdk21
EXPOSE 80
VOLUME [ "/opt/src" ]
WORKDIR /opt/src

# ENTRYPOINT ["./gradlew", "build", "bootRun"]
ENTRYPOINT ["/bin/bash", "-c", "./gradlew build && ./gradlew bootRun"]