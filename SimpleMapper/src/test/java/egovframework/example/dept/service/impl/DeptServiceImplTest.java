package egovframework.example.dept.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import egovframework.example.common.Criteria;
import egovframework.example.dept.service.DeptService;
import egovframework.example.dept.service.DeptVO;
import lombok.extern.log4j.Log4j2;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {
		"classpath:/egovframework/spring/context-aspect.xml",
	    "classpath:/egovframework/spring/context-common.xml",
	    "classpath:/egovframework/spring/context-datasource.xml",
	    "classpath:/egovframework/spring/context-idgen.xml",
	    "classpath:/egovframework/spring/context-mapper.xml",
	    "classpath:/egovframework/spring/context-sqlMap.xml",
	    "classpath:/egovframework/spring/context-transaction.xml"
	})
@Log4j2
class DeptServiceImplTest {

	@Autowired
	DeptService deptService;
	
	@Test
	void testSelectDeptList() {
//		테스트 : 검색 조회가 잘 되는 지 확인? 조건값을 준비
//		given: 조건값
		Criteria criteria=new Criteria();
		criteria.setFirstIndex(0);  //1페이지(0), 2페이지(3)
		criteria.setPageUnit(3);
		criteria.setSearchKeyword("");
		
//		when: 실제 검색어 조회
		List<?> list=deptService.selectDeptList(criteria);
		
//		then: 결과예상값(list2) vs 실제결과(list)
		log.info(list);
		assertNotNull(list);   // list 에 값이 없으면 테스트 실패
	}
	
	@Test
	void testSelectDeptListTotCnt() {
//		테스트 : 검색 조회가 잘 되는 지 확인? 조건값을 준비
//		given:
		Criteria criteria=new Criteria();
		
//		when: 실제 검색어 조회
		int count=deptService.selectDeptListTotCnt(criteria);
		
//		then: 결과예상값(list2) vs 실제결과(list)
		log.info(count);
		assertEquals(8, count);
	}

	@Test
	void testInsert() {
//		테스트 : insert 가 잘 되는 지 확인? 조건값을 준비
//		given: 테스트 데이터 준비
		DeptVO deptVO=new DeptVO(0,"개발부","부산"); // 기본키는 시퀀스 사용
//		when: 실제 검색어 조회
		deptService.insert(deptVO);
//		then: DB 확인 또는 검색어조회("개발부")를 통해 검증가능합니다.
	}

	@Test
	void testSelectDept() {
//		테스트 : 검색 조회가 잘 되는 지 확인? 조건값을 준비
//		given: 조건값
		long dno=10;
		
//		when: 실제 검색어 조회
		DeptVO deptVO=deptService.selectDept(20);
		
//		then: 결과예상값(list2) vs 실제결과(list)
		log.info(deptVO);
		DeptVO deptVO2=new DeptVO(20, "RESEARCH","DALLAS");
		assertEquals(deptVO, deptVO2);
	}

	@Test
	void testUpdate() {
//		테스트 : insert 가 잘 되는 지 확인? 조건값을 준비
//		given: 테스트 데이터 준비
		DeptVO deptVO=new DeptVO(20,"개발부","부산"); // 기본키는 시퀀스 사용
//		when: 실제 검색어 조회
		deptService.update(deptVO);
//		then: DB 확인 또는 상세조회로 확인 가능
	}

	@Test
	void testDelete() {
//		테스트 : insert가 잘 되는 지 확인? 조건값을 준비
//		given: 테스트 데이터 준비
		DeptVO deptVO=new DeptVO(); // 기본키는 시퀀스 사용
		deptVO.setDno(1490);
//		when: 실제 검색어 조회
		deptService.delete(deptVO);
//		then: DB 확인
	}
}





