/**
 * 
 */
package com.simplecoding.simplemapper.dept.service;

import com.simplecoding.simplemapper.common.Criteria;
import com.simplecoding.simplemapper.dept.mapper.DeptMapper;

import com.simplecoding.simplemapper.dept.vo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {
	
	@Autowired
	private DeptMapper deptMapper;

	
	public List<?> selectDeptList(Criteria criteria) {
		return deptMapper.selectDeptList(criteria);
	}
	
	
	public int selectDeptListTotCnt(Criteria criteria) {
		return deptMapper.selectDeptListTotCnt(criteria);
	}
	
	
	public void insert(Dept dept) {
		deptMapper.insert(dept);
	}
	
	
	public Dept selectDept(int dno) {
		Dept dept = deptMapper.selectDept(dno);
		return dept;
	}

	
	public void update(Dept dept) {
		deptMapper.update(dept);
	}

	
	public void delete(Dept dept) {
		deptMapper.delete(dept);
	}
}








