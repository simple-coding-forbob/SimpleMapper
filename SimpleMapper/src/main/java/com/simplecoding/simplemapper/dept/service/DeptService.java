/**
 * 
 */
package com.simplecoding.simplemapper.dept.service;

import com.simplecoding.simplemapper.common.Criteria;
import com.simplecoding.simplemapper.dept.mapper.DeptMapper;

import com.simplecoding.simplemapper.dept.vo.DeptVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {
	
	@Autowired
	private DeptMapper deptMapper;

	
	public List<?> selectDeptList(Criteria searchVO) {
		return deptMapper.selectDeptList(searchVO);
	}
	
	
	public int selectDeptListTotCnt(Criteria searchVO) {
		return deptMapper.selectDeptListTotCnt(searchVO);
	}
	
	
	public void insert(DeptVO deptVO) {
		deptMapper.insert(deptVO);
	}
	
	
	public DeptVO selectDept(int dno) {
		DeptVO deptVO = deptMapper.selectDept(dno);
		return deptVO;
	}

	
	public void update(DeptVO deptVO) {
		deptMapper.update(deptVO);
	}

	
	public void delete(DeptVO deptVO) {
		deptMapper.delete(deptVO);
	}
}








