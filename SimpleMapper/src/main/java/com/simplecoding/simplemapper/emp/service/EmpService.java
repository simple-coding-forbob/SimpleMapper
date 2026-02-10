/**
 * 
 */
package com.simplecoding.simplemapper.emp.service;

import com.simplecoding.simplemapper.common.Criteria;
import com.simplecoding.simplemapper.emp.mapper.EmpMapper;

import com.simplecoding.simplemapper.emp.vo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {
	
	@Autowired
    EmpMapper empMapper;
	
	
	public List<?> selectEmpList(Criteria searchVO) {
		return empMapper.selectEmpList(searchVO);
	}

	
	public int selectEmpListTotCnt(Criteria searchVO) {
		return empMapper.selectEmpListTotCnt(searchVO);
	}
	
	
	public void insert(Emp emp) {
		empMapper.insert(emp);
	}
	
	
	public Emp selectEmp(int eno) {
		Emp emp = empMapper.selectEmp(eno);
		return emp;
	}
	
	
	public void update(Emp emp) {
		empMapper.update(emp);
	}
	
	
	public void delete(Emp emp) {
		empMapper.delete(emp);
	}
}






