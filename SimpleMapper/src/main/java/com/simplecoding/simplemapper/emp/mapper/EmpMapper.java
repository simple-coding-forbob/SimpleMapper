/**
 * 
 */
package com.simplecoding.simplemapper.emp.mapper;

import com.simplecoding.simplemapper.common.Criteria;
import com.simplecoding.simplemapper.emp.vo.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//TODO: 반드시 전자정부프레임워크 용 @Mapper 를 import 해야 컴포넌트 스캔에러가 발생 안됨
@Mapper
public interface EmpMapper {
	List<?> selectEmpList(Criteria searchVO);   // 전체 조회
	int selectEmpListTotCnt(Criteria searchVO); // 개수 세기
	int insert(Emp emp);                    // insert 함수
	Emp selectEmp(int eno);                   // 상세조회 함수
	int update(Emp emp);                    // update 함수
	int delete(Emp emp);                    // delete 함수
}



