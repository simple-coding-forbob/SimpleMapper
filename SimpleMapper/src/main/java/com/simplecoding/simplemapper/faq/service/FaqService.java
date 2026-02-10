/**
 * 
 */
package com.simplecoding.simplemapper.faq.service;

import com.simplecoding.simplemapper.common.Criteria;
import com.simplecoding.simplemapper.faq.mapper.FaqMapper;

import com.simplecoding.simplemapper.faq.vo.Faq;
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
	
	
	public void insert(Faq faq) {
		faqMapper.insert(faq);
	}
	
	
	public Faq selectFaq(int fno) {
		Faq faq = faqMapper.selectFaq(fno);
		return faq;
	}

	
	public void update(Faq faq) {
		faqMapper.update(faq);
	}

	
	public void delete(Faq faq) {
		faqMapper.delete(faq);
	}
}








