/**
 * 
 */
package egovframework.example.faq.service;

import java.util.List;

import egovframework.example.common.Criteria;

public interface FaqService {
	List<?> selectFaqList(Criteria criteria) throws Exception;
	int selectFaqListTotCnt(Criteria criteria);     
	void insert(FaqVO faqVO) throws Exception; 
	FaqVO selectFaq(int fno) throws Exception;     
	void update(FaqVO faqVO) throws Exception; 
	void delete(FaqVO faqVO) throws Exception;
}










