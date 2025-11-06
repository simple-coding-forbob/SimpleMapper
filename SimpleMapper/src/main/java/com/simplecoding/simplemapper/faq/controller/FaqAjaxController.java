/**
 * 
 */
package com.simplecoding.simplemapper.faq.controller;

import com.simplecoding.simplemapper.common.Criteria;
import com.simplecoding.simplemapper.faq.service.FaqService;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author simple-coding
 * AutoComplete
 */
@Log4j2
@RestController
public class FaqAjaxController {
	@Autowired
	private FaqService faqService;

	@GetMapping("/api/faq")
	public List<?> selectFaqList(@ModelAttribute("searchVO") Criteria criteria) throws Exception {

		List<?> list = faqService.selectFaqList(criteria);
		
		return list;
	}	
}
