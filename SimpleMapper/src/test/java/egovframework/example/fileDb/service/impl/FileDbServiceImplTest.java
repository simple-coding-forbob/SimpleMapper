package egovframework.example.fileDb.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import egovframework.example.common.Criteria;
import egovframework.example.fileDb.service.FileDbService;
import egovframework.example.fileDb.service.FileDbVO;
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
class FileDbServiceImplTest {

	@Autowired
	FileDbService fileDbService;
	
	@Test
	void testSelectFileDbList() {
//		테스트 : 검색 조회가 잘 되는 지 확인? 조건값을 준비
//		given: 조건값
		Criteria criteria=new Criteria();
		criteria.setFirstIndex(0);  //1페이지(0), 2페이지(3)
		criteria.setPageUnit(3);
		criteria.setSearchKeyword("");
		
//		when: 실제 검색어 조회
		List<?> list=fileDbService.selectFileDbList(criteria);
		
//		then: 결과예상값(list2) vs 실제결과(list)
		log.info(list);
		assertNotNull(list);   // list 에 값이 없으면 테스트 실패
	}

	@Test
	void testSelectFileDbListTotCnt() {
//		테스트 : 검색 조회가 잘 되는 지 확인? 조건값을 준비
//		given:
		Criteria criteria=new Criteria();
		
//		when: 실제 검색어 조회
		int count=fileDbService.selectFileDbListTotCnt(criteria);
		
//		then: 결과예상값(list2) vs 실제결과(list)
		log.info(count);
		assertEquals(4, count);
	}

	@Test
	void testSelectFileDb() {
//		테스트 : 검색 조회가 잘 되는 지 확인? 조건값을 준비
//		given: 조건값
		String uuid="12345672";
		
//		when: 실제 검색어 조회
		FileDbVO fileDbVO=fileDbService.selectFileDb(uuid);
		
//		then: 결과예상값(list2) vs 실제결과(list)
		log.info(fileDbVO);
	}

	@Test
	void testDelete() {
//		테스트 : insert가 잘 되는 지 확인? 조건값을 준비
//		given: 테스트 데이터 준비
		
//		when: 실제 검색어 조회
		fileDbService.delete("12345672");
//		then: DB 확인
	}
}
