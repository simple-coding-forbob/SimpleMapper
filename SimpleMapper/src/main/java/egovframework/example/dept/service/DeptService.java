/**
 * 
 */
package egovframework.example.dept.service;

import java.util.List;

import egovframework.example.common.Criteria;

public interface DeptService {
	List<?> selectDeptList(Criteria searchVO) throws Exception;
	int selectDeptListTotCnt(Criteria searchVO);     
	void insert(DeptVO deptVO) throws Exception; 
	DeptVO selectDept(int dno) throws Exception;     
	void update(DeptVO deptVO) throws Exception; 
	void delete(DeptVO deptVO) throws Exception; 
}










