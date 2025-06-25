# SimpleMapper
-- 전체조회 : 페이징 : 화면에 보이는개수(3), 
-- OFFSET(등차수열의 등차:3): 1페이지-0, 2페이지-(0+3)3, ... 
SELECT * FROM TB_DEPT
WHERE DNAME LIKE '%%'
OFFSET 0+3 ROWS
FETCH NEXT 3 ROWS ONLY;