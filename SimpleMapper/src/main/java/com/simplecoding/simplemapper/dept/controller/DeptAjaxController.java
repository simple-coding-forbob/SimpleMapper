/**
 * 
 */
package com.simplecoding.simplemapper.dept.controller;


import com.simplecoding.simplemapper.common.Criteria;
import com.simplecoding.simplemapper.dept.service.DeptService;
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
public class DeptAjaxController {
	@Autowired
	private DeptService deptService;

	@GetMapping("/api/dept")
	public List<?> selectDeptList(@ModelAttribute("searchVO") Criteria criteria) throws Exception {
		List<?> list = deptService.selectDeptList(criteria);
		
		return list;
	}	
}
