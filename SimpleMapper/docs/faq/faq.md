# Faq 게시판
## Faq 게시판 주소: http://localhost:8080/faq
## 스프링 코딩 순서: 1) vo 2) mapper 3) xml 4) service 5) controller 6) jsp
## Faq 테이블: TB_FAQ

# 기능별 코딩 순서
## 1. Faq 전체 조회
### 1) TB_FAQ 2) Faq -> 3) FaqMapper(selectFaqList) -> 4) Faq.xml(selectFaqList)
-> 5) FaqService(selectFaqList) -> 6) FaqController(selectFaqList,/faq) -> 7) faq/faq_all.jsp(fn_search)

## 2. Faq 전체 조회에 페이지번호 넣기
### 1) FaqMapper(selectFaqListTotCnt) -> 2) Faq.xml(selectFaqListTotCnt)
-> 3) FaqService(selectFaqListTotCnt) -> 4) FaqController(selectFaqList,/faq) -> 5) faq/faq_all.jsp(twbsPagination)

## 3. Faq 추가
### 1) FaqMapper(insert) -> 2) Faq.xml(insert)
-> 3) FaqService(insert) -> 4) FaqController(createFaqView,/faq/addition),(insert,/faq/add) -> 5) faq/add_faq.jsp(fn_save)

## 4. Faq 상세조회
### 1) FaqMapper(selectFaq) -> 2) Faq.xml(selectFaq)
-> 3) FaqService(selectFaq) -> 4) FaqController(updateFaqView,/faq/edition) -> 5) faq/update_faq.jsp

## 5. Faq 수정
### 1) FaqMapper(update) -> 2) Faq.xml(update)
-> 3) FaqService(update) -> 4) FaqController(update,/faq/edit) -> 5) faq/update_faq.jsp(fn_save)

## 6. Faq 삭제
### 1) FaqMapper(delete) -> 2) Faq.xml(delete)
-> 3) FaqService(delete) -> 4) FaqController(delete,/faq/delete) -> 5) faq/update_faq.jsp(fn_delete)