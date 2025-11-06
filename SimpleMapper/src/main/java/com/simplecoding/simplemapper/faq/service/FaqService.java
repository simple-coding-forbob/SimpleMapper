/**
 * 
 */
package com.simplecoding.simplemapper.faq.service;

import com.simplecoding.simplemapper.common.Criteria;
import com.simplecoding.simplemapper.faq.mapper.FaqMapper;

import com.simplecoding.simplemapper.faq.vo.FaqVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaqService {
	
	@Autowired
	private FaqMapper faqMapper;

	
	public List<?> selectFaqList(Criteria criteria) {
		return faqMapper.selectFaqList(criteria);
	}
	
	
	public int selectFaqListTotCnt(Criteria criteria) {
		return faqMapper.selectFaqListTotCnt(criteria);
	}
	
	
	public void insert(FaqVO faqVO) {
		faqMapper.insert(faqVO);
	}
	
	
	public FaqVO selectFaq(int fno) {
		FaqVO faqVO = faqMapper.selectFaq(fno);
		return faqVO;
	}

	
	public void update(FaqVO faqVO) {
		faqMapper.update(faqVO);
	}

	
	public void delete(FaqVO faqVO) {
		faqMapper.delete(faqVO);
	}
}








