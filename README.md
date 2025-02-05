# 💵적금할까 예금할까?

적금 수익을 예금이자로 환산해주는 서비스

## API

### 적금 이자를 예금 금리로 변환
`GET` **yearly-interest**

**Request Query**

| Name | Type | Description
|:---|:---|:---|
|<a>monthlySaving<a> | Long| 원단위의 적금 월 납입금액|
|<a>durationMonth<a> | Int| 적금 개월수|
|<a>interestPercent<a> | Double| 적금 연 이율|

**Response Body**
| Name | Type | Description |
|:---|:---|:--------|
|<a>totalInput<a> | Long| 적금 총 입금액|
|<a>benefit<a> | Long| 적금 만기시 이자 총액 (월 복리 적용)|
|<a>depositInterestPercent<a> | Double| 적금 총액에 대한 이자를 단리 예금 이자로 환산한 결과|


## 활용 프레임워크

### Frontend
- 배포 : AWS EC2 
- 웹서버 : nginx

### Backend
- 배포 : AWS EC2
- API 서버 : Spring Boot
- 가상화 : AWS ECR, Docker
