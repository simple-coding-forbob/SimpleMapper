/**
 * 
 */
package egovframework.example.dept.service;

import java.util.List;

import egovframework.example.common.Criteria;

public interface DeptService {
	List<?> selectDeptList(Criteria criteria);
	int selectDeptListTotCnt(Criteria criteria);
	void insert(DeptVO deptVO);
	DeptVO selectDept(int dno);
	void update(DeptVO deptVO);
	void delete(DeptVO deptVO);
}










