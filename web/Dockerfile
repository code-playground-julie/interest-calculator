# Nginx 기반 이미지 사용
FROM nginx:latest

# Nginx의 기본 콘텐츠 위치로 HTML 파일 복사
COPY index.html /usr/share/nginx/html/index.html
COPY error.html /usr/share/nginx/html/error.html

# Nginx 설정 파일 복사
COPY default.conf /etc/nginx/conf.d/default.conf

# Nginx 포트 9090 노출
EXPOSE 9090

# 도커 이미지 생성
# docker build -t interest-web .

# 컨테이너 실행
# docker run -p 443:9090 이미지명