/**
 * 
 */
package egovframework.example.dept.service.impl;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import egovframework.example.common.Criteria;
import egovframework.example.dept.service.DeptVO;

@Mapper
public interface DeptMapper {
	public List<?> selectDeptList(Criteria criteria);   // 전체 조회
	public int selectDeptListTotCnt(Criteria criteria); // 개수 세기
	public int insert(DeptVO deptVO);                   // insert 함수
	public DeptVO selectDept(int dno);                  // 상세조회 함수
	public int update(DeptVO deptVO);                   // update 함수
	public int delete(DeptVO deptVO);                   // delete 함수
}






