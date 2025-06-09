/**
 * 
 */
package egovframework.example.dept.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.example.common.Criteria;
import egovframework.example.dept.service.DeptService;
import egovframework.example.dept.service.DeptVO;

@Service
public class DeptServiceImpl implements DeptService {
	
	@Autowired
	private DeptMapper deptMapper;

	@Override
	public List<?> selectDeptList(Criteria criteria)  {
		return deptMapper.selectDeptList(criteria);
	}
	
	@Override
	public int selectDeptListTotCnt(Criteria criteria) {
		return deptMapper.selectDeptListTotCnt(criteria);
	}
	
	@Override
	public void insert(DeptVO deptVO)  {
		deptMapper.insert(deptVO);
	}
	
	@Override
	public DeptVO selectDept(int dno)  {
		DeptVO deptVO = deptMapper.selectDept(dno);
		return deptVO;
	}

	@Override
	public void update(DeptVO deptVO)  {
		deptMapper.update(deptVO);
	}

	@Override
	public void delete(DeptVO deptVO)  {
		deptMapper.delete(deptVO);
	}
}








