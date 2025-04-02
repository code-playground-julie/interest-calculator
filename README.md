# 💵[적금할까 예금할까?](http://13.125.205.117:443/index.html)

적금 수익을 예금이자로 환산해주는 서비스

API 문서 바로가기 ➡️ [Swagger UI](http://13.125.205.117/swagger-ui/index.html)

## 환경설정 가이드

### 새 인스턴스 배포하기
1. interest-calculator-live 보안그룹 사용하여 인스턴스 생성
2. DB 정보 확인
3.`su` 타이핑 후 루트 패스워드 등록
4. setup-linux.sh를 원하는 인스턴스에 복사
5. env 파일을 프로젝트 디렉터리에 복사 후 setup-linux.sh 스크립트 실행
```
chmod +x setup-linux.sh
sh setup-linux.sh
```
6. 프로젝트 실행 확인 `sudo docker ps`


