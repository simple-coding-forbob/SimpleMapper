/**
 * 
 */
package com.simplecoding.simplemapper.dept.mapper;


import com.simplecoding.simplemapper.common.Criteria;
import com.simplecoding.simplemapper.dept.vo.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {
	List<?> selectDeptList(Criteria criteria);   // 전체 조회
	int selectDeptListTotCnt(Criteria criteria); // 개수 세기
	int insert(Dept dept);                   // insert 함수
	Dept selectDept(int dno);                  // 상세조회 함수
	int update(Dept dept);                   // update 함수
	int delete(Dept dept);                   // delete 함수
}
