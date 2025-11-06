/**
 * 
 */
package com.simplecoding.simplemapper.emp.service;

import com.simplecoding.simplemapper.common.Criteria;
import com.simplecoding.simplemapper.emp.mapper.EmpMapper;

import com.simplecoding.simplemapper.emp.vo.EmpVO;
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
	
	
	public void insert(EmpVO empVO) {
		empMapper.insert(empVO);
	}
	
	
	public EmpVO selectEmp(int eno) {
		EmpVO empVO = empMapper.selectEmp(eno);
		return empVO;
	}
	
	
	public void update(EmpVO empVO) {
		empMapper.update(empVO);
	}
	
	
	public void delete(EmpVO empVO) {
		empMapper.delete(empVO);
	}
}






