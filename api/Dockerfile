# Multi-stage build로 jar 파일만 컨테이너에 남김
# 1. Host 머신에서 jar 파일 빌드
FROM gradle:8.12.0-jdk21 AS build
WORKDIR /app
COPY . .
RUN gradle build --no-daemon

# 2. jar 파일 실행
FROM amazoncorretto:21.0.4-alpine3.18
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]

# 이후는 compose.yml에서 수행
# 3. docker image 빌드 및 실행
# 3-1. jar 파일 위치 알려주고 이미지 빌드
# docker build --build-arg JAR_FILE=build/libs/\*.jar -t interest-api .
# 3-2. 포트포워딩 포함해서 컨테이너 실행
# docker run -p 9090:9090 이미지명
# docker run -p 80:9090 interest-api