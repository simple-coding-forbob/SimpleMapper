# 사원 게시판
## 사원 게시판 주소: http://localhost:8080/emp
## 스프링 코딩 순서: 1) vo 2) mapper 3) xml 4) service 5) controller 6) jsp
## 사원 테이블: TB_EMP
### 컬럼:
    ENO	        NUMBER
    ENAME	    VARCHAR2(255 BYTE)
    JOB	        VARCHAR2(255 BYTE)
    MANAGER	    NUMBER
    HIREDATE	DATE
    SALARY	    NUMBER
    COMMISSION	NUMBER
    DNO	        NUMBER

# 기능별 코딩 순서
## 1. 사원 전체 조회
### 1) TB_EMP 2) Emp -> 3) EmpMapper(selectEmpList) -> 4) Emp.xml(selectEmpList)
-> 5) EmpService(selectEmpList) -> 6) EmpController(selectEmpList,/emp) -> 7) emp/emp_all.jsp(fn_search)

## 2. 사원 전체 조회에 페이지번호 넣기
### 1) EmpMapper(selectEmpListTotCnt) -> 2) Emp.xml(selectEmpListTotCnt)
-> 3) EmpService(selectEmpListTotCnt) -> 4) EmpController(selectEmpList,/emp) -> 5) emp/emp_all.jsp(twbsPagination)

## 3. 사원 추가
### 1) EmpMapper(insert) -> 2) Emp.xml(insert)
-> 3) EmpService(insert) -> 4) EmpController(createEmpView,/emp/addition),(insert,/emp/add) -> 5) emp/add_emp.jsp(fn_save)

## 4. 사원 상세조회
### 1) EmpMapper(selectEmp) -> 2) Emp.xml(selectEmp)
-> 3) EmpService(selectEmp) -> 4) EmpController(updateEmpView,/emp/edition) -> 5) emp/update_emp.jsp

## 5. 사원 수정
### 1) EmpMapper(update) -> 2) Emp.xml(update)
-> 3) EmpService(update) -> 4) EmpController(update,/emp/edit) -> 5) emp/update_emp.jsp(fn_save)

## 6. 사원 삭제
### 1) EmpMapper(delete) -> 2) Emp.xml(delete)
-> 3) EmpService(delete) -> 4) EmpController(delete,/emp/delete) -> 5) emp/update_emp.jsp(fn_delete)