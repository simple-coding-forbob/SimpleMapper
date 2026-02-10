/**
 * 
 */
package com.simplecoding.simplemapper.faq.mapper;



import com.simplecoding.simplemapper.common.Criteria;
import com.simplecoding.simplemapper.faq.vo.Faq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author TaeGyung
 *
 */
@Mapper
public interface FaqMapper {
	List<?> selectFaqList(Criteria searchVO);   // 전체 조회
	int selectFaqListTotCnt(Criteria searchVO); // 개수 세기
	int insert(Faq faq);                   // insert 함수
	Faq selectFaq(int dno);                  // 상세조회 함수
	int update(Faq faq);                   // update 함수
	int delete(Faq faq);                   // delete 함수
}