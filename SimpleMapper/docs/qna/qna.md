# Qna 게시판
## Qna 게시판 주소: http://localhost:8080/qna
## 스프링 코딩 순서: 1) vo 2) mapper 3) xml 4) service 5) controller 6) jsp
## Qna 테이블: TB_FAQ
### 컬럼: 
    QNO	        NUMBER
    QUESTIONER	VARCHAR2(255 BYTE)
    QUESTION	VARCHAR2(4000 BYTE)
    ANSWER	    VARCHAR2(4000 BYTE)
    ANSWERER	VARCHAR2(255 BYTE)

# 기능별 코딩 순서
## 1. Qna 전체 조회
### 1) TB_FAQ 2) Qna -> 3) QnaMapper(selectQnaList) -> 4) Qna.xml(selectQnaList)
-> 5) QnaService(selectQnaList) -> 6) QnaController(selectQnaList,/qna) -> 7) qna/qna_all.jsp(fn_search)

## 2. Qna 전체 조회에 페이지번호 넣기
### 1) QnaMapper(selectQnaListTotCnt) -> 2) Qna.xml(selectQnaListTotCnt)
-> 3) QnaService(selectQnaListTotCnt) -> 4) QnaController(selectQnaList,/qna) -> 5) qna/qna_all.jsp(twbsPagination)

## 3. Qna 추가
### 1) QnaMapper(insert) -> 2) Qna.xml(insert)
-> 3) QnaService(insert) -> 4) QnaController(createQnaView,/qna/addition),(insert,/qna/add) -> 5) qna/add_qna.jsp(fn_save)

## 4. Qna 상세조회
### 1) QnaMapper(selectQna) -> 2) Qna.xml(selectQna)
-> 3) QnaService(selectQna) -> 4) QnaController(updateQnaView,/qna/edition) -> 5) qna/update_qna.jsp

## 5. Qna 수정
### 1) QnaMapper(update) -> 2) Qna.xml(update)
-> 3) QnaService(update) -> 4) QnaController(update,/qna/edit) -> 5) qna/update_qna.jsp(fn_save)

## 6. Qna 삭제
### 1) QnaMapper(delete) -> 2) Qna.xml(delete)
-> 3) QnaService(delete) -> 4) QnaController(delete,/qna/delete) -> 5) qna/update_qna.jsp(fn_delete)