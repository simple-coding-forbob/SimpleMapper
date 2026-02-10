# spring 코딩법: 순서
# spring 인터넷 기본주소: http://localhost:8080
# 1) vo(db 테이블과 비슷) -> 2) mapper(sql) -> 3) service(기능별 함수) -> 4) controller(인터넷주소+화면) -> 5) jsp(화면)

## 1) vo : 테이블의 데이터, 화면 입력값을 자바 클래스에 임시저장할 목적으로 사용합니다.
##       1) 업무 테이블의 컬럼을 참고해서 클래스의 필드를 작성합니다.
         2) 생성자, setter, getter, tostring, equals, hashCode 를 추가합니다. 어노테이션을 이용합니다.
         3) 최초 1번만 작성합니다.

## 2) mapper : CRUD 함수를 작성합니다. 기능별 sql 을 작성합니다.
       1) 인터페이스 : 인터페이스를 작성하고 안에 CRUD 함수를 작성합니다. 
       2) xml      : 기능별 실제 sql 을 작성합니다.

## 3) service: mapper 의 CRUD 함수를 사용해서 기능별 함수를 작성합니다.
      1) 기본 6개(전체조회,총데이터개수, 추가, 상세조회, 수정, 삭제)를 작성합니다. 상황에 따라 기능을 추가/생략합니다.

## 4) controller: 각 기능별 인터넷 주소를 정하고 해당 화면(JSP)를 연결합니다.
       1) /dept(인터넷 주소) -> dept_all.jsp(화면)
       2) 함수위에 어노테이션을(@GETMAPPING 등) 이용해서 작성합니다.

# 3) 페이징 이론
## 페이지 SQL 사용법
    SELECT * FROM 테이블 WHERE 컬럼 LIKE '%'||''||'%'
    OFFSET 데이터순번 ROWS
    FETCH NEXT 화면에보일개수 ROWS ONLY;
## OFFSET ~ ONLY 까지가 페이징 예약어입니다.
## 화면에보일개수: 화면에 몇개를 보여줄건가
## 데이터순번(오프셋): 0부터 시작합니다, 배열순번과 비슷합니다.
### 예) 1 페이지=> 3개씩(0~2순번), 현재페이지번호 * 화면에 보일개수: 0*3=> 데이터순번: 0
###     2 페이지=> 3개씩(3순번)    1*3=> 데이터순번: 3

# 5) 화면에서 페이지번호 보이기 : 
## js 페이징 플러그인 사용법
### 1) css 넣기: <link rel="stylesheet" href="/css/pagination.css">
### 2) js  cdn: <script src="https://cdnjs.cloudflare.com/ajax/libs/twbs-pagination/1.4.2/jquery.twbsPagination.min.js"></script>
### 3) input 태그 추가 : <input type="hidden" id="page" name="page" value="0">
### 4) js 코딩 추가     : 
    /* 페이징 처리 */
    $('#pagination').twbsPagination({
        totalPages: 총페이지수,
        startPage:현재페이지번호,
        visiblePages: 화면에 보일개수,
        initiateStartPageClick: false,
        onPageClick: function (event, page) {
            $("#page").val(page);              // 페이지번호 클릭하면 값 전달
            fn_search()
        }
    });