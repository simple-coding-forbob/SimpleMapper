# 부서 게시판
## 부서 게시판 주소: http://localhost:8080/dept
## 스프링 코딩 순서: 1) vo 2) mapper 3) xml 4) service 5) controller 6) jsp
## 부서 테이블: TB_DEPT

# 기능별 코딩 순서
## 1. 부서 전체 조회
### 1) TB_DEPT 2) Dept -> 3) DeptMapper(selectDeptList) -> 4) Dept.xml(selectDeptList) 
   -> 5) DeptService(selectDeptList) -> 6) DeptController(selectDeptList,/dept) -> 7) dept/dept_all.jsp(fn_search)

## 2. 부서 전체 조회에 페이지번호 넣기
### 1) DeptMapper(selectDeptListTotCnt) -> 2) Dept.xml(selectDeptListTotCnt)
   -> 3) DeptService(selectDeptListTotCnt) -> 4) DeptController(selectDeptList,/dept) -> 5) dept/dept_all.jsp(twbsPagination)

## 3. 부서 추가
### 1) DeptMapper(insert) -> 2) Dept.xml(insert)
-> 3) DeptService(insert) -> 4) DeptController(createDeptView,/dept/addition),(insert,/dept/add) -> 5) dept/add_dept.jsp(fn_save)

## 4. 부서 상세조회 
### 1) DeptMapper(selectDept) -> 2) Dept.xml(selectDept)
-> 3) DeptService(selectDept) -> 4) DeptController(updateDeptView,/dept/edition) -> 5) dept/update_dept.jsp

## 5. 부서 수정
### 1) DeptMapper(update) -> 2) Dept.xml(update)
-> 3) DeptService(update) -> 4) DeptController(update,/dept/edit) -> 5) dept/update_dept.jsp(fn_save)

## 6. 부서 삭제
### 1) DeptMapper(delete) -> 2) Dept.xml(delete)
-> 3) DeptService(delete) -> 4) DeptController(delete,/dept/delete) -> 5) dept/update_dept.jsp(fn_delete)