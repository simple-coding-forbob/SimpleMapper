# FileDb 게시판
## FileDb 게시판 주소: http://localhost:8080/fileDb
## 스프링 코딩 순서: 1) vo 2) mapper 3) xml 4) service 5) controller 6) jsp
## FileDb 테이블: TB_FILE_DB

# 기능별 코딩 순서
## 1. FileDb 전체 조회
### 1) TB_FILE_DB 2) FileDb -> 3) FileDbMapper(selectFileDbList) -> 4) FileDb.xml(selectFileDbList) 
   -> 5) FileDbService(selectFileDbList) -> 6) FileDbController(selectFileDbList,/fileDb) -> 7) fileDb/fileDb_all.jsp(fn_search)

## 2. FileDb 전체 조회에 페이지번호 넣기
### 1) FileDbMapper(selectFileDbListTotCnt) -> 2) FileDb.xml(selectFileDbListTotCnt)
   -> 3) FileDbService(selectFileDbListTotCnt) -> 4) FileDbController(selectFileDbList,/fileDb) -> 5) fileDb/fileDb_all.jsp(twbsPagination)

## 3. FileDb 추가
### 1) FileDbMapper(insert) -> 2) FileDb.xml(insert)
-> 3) FileDbService(insert) -> 4) FileDbController(createFileDbView,/fileDb/addition),(insert,/fileDb/add) -> 5) fileDb/add_fileDb.jsp(fn_save)

## 4. FileDb 이미지 다운로드(pc에서 이미지 가져오기)
### 1) FileDbController(fileDownload,/download/fileDb)

## 5. FileDb 삭제
### 1) FileDbMapper(delete) -> 2) FileDb.xml(delete)
-> 3) FileDbService(delete) -> 4) FileDbController(delete,/fileDb/delete) -> 5) fileDb/fileDb_all.jsp(fn_delete)