# [Please Recipe!](https://documenter.getpostman.com/view/21188585/Uz5Dobra)

# 📌 프로젝트 소개


🔎 메뉴를 보여주고, 주문을 받고, 메뉴를 추가하고, 메뉴를 삭제하는 API



## 🙌 팀원

### [장영광](https://github.com/glory9802)

- create 기능

### [박미희](https://github.com/PMH2906)

- read 기능

### [강희원](https://github.com/Money1Kang)

- update

### [박동규](https://github.com/uyggnodkrap)

- delete 기능

---

# 📌 테이블, 기능 명세

### ERD

![Erd](https://user-images.githubusercontent.com/100591948/171046070-1605f4e9-728b-46d7-b33d-d6a75fd6de2e.png)


### 테이블

| column | type | description |
| --- | --- | --- |
| id | smallint | pk |
| name | varchar(45) | 메뉴 이름 |
| minute | varchar(45) | 조리 시간 |
| cost | integer | 가격 |
| quantity | integer | 수량 |

## 기능 명세

![기능명세](https://user-images.githubusercontent.com/100591948/171046042-5aedf15a-692a-4baf-b03e-ab50f3707e4b.png)


| 기능 | 명세 |
| --- | --- |
| add | 메뉴 추가 |
| allMenu | 모든 메뉴 조회 |
| delete | 메뉴 삭제 |
| update | 메뉴 상세정보 수정 |



---

# 📌 트러블 슈팅(Trouble shooting)

### Lombok 실행 시 오류

ERROR : the method builder() is undefined for the type refrigerator

REFERENCE : [https://jamong-icetea.tistory.com/152](https://jamong-icetea.tistory.com/152)

미해결 : Lombok을 다운받아 사용하는 이클립스 실행파일 경로를 설정해주었지만 여전히 오류 발생하여 Lombok 사용 포기.. 

### tomcat 실행 시 port 충돌

ERROR : Several ports (8005, 8080) required by Tomcat v8.5 Server at localhost are already in use. The server may already be running in another process, or a system process may be using the port. To start this server you will need to stop the other process or change the port number(s)

REFERENCE : [https://to-dy.tistory.com/59](https://to-dy.tistory.com/59)
### JPQL QUERY 참고 블로그

REFERENCE : [https://data-make.tistory.com/614](https://to-dy.tistory.com/59)
 
---

# 📌 한계점

1. 테이블을 하나만 쓴 것이 아쉬웠다. 테이블을 여러개  만들어서 서로 조인하면서 조금 더 규모있는 프로젝트도 해보고싶지만, 아직은 시기가 이른 것 같기도 하고, 역량이 부족한 것 같기도 하다.

---

# 📌 느낀점

### 강희원

- 무언가 만남을 통해  부족한점을 항상 채워가는것에 대하여, 미안하고 조심스럽기만 했는데, 성장통이라 믿고 하나씩 해결해 나갔습니다. 우리가 속성으로 강사님의 강의를 들으면서도 충분히 단시간에 기능구현이 가능하리라 생각하지만, 막상 각자 실습을 하며, 코드 작성하는데에 있어서 좌절과 기쁨을 동시에 맛봤습니다. 교대근처 쭈꾸미는 맛있구요. 고생하셨습니다.

### 박미희

- frontend없이 data를 다루는 것이 어려웠지만 팀원들과 함께 구상하면서 한 단계씩 구현해 나갈 수 있어, 뿌듯했습니다. 브라우저, 서버, DB 사이에서 데이터가 오고 가는 과정을 복습할 수 있었고, 아키텍처에 대해 생각해 볼 수 있는 프로젝트였습니다. 팀원들과 함께 기능별로 브랜치를 생성하고 push를 하는 과정에서, 동규님이 추천해주신 컨벤션을 참고해 깔끔하게 진행되어 뿌듯했습니다. 저희 commit 메세지 너무 귀엽습니당~~~

### 장영광

- 처음에는 많이 막막했지만 좋은 팀원들의 도움으로 차근차근 과제를 수행해 나가는 보람을 느낄수 있었고 방향을 잘못잡아서 삽질도 많이 하였습니다.  한걸음이 모자라서 같은 자리를 맴도느라 스트레스도 많이 받았지만 완성을 한 뒤의 성취감을 느낄수 있어서 좋았습니다.  github는 아직도 어렵지만 조금이나마 사용법을 알게되어 뿌듯합니다. 앞으로도 잘 활용할 수 있도록 연습해야겠습니다.

### 박동규

- html 버튼도 만들고 안해본 것 없이 갈팡질팡 하면서 프로젝트를 마무리 지었는데, 아마도 그 만큼 공부가 덜 되어서 그런 것 같습니다. 그래도 좋은 경험이였습니다. 처음으로 수강생분들과 직접 만나서 프로젝트를 진행했는데, 다들 유쾌하시고 재밌었습니다. 그리고 무엇보다 깃 컨벤션에 신경쓰면서 프로젝트를 해보고 싶었는데 이번 기회 하게 된 것 같아서 좋았습니다. 다들 고생 많으셨고 다음에 또 만나요!
