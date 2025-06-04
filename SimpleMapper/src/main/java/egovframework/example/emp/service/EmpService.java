package egovframework.example.emp.service;

import java.util.List;

import egovframework.example.common.Criteria;

public interface EmpService {
	List<?> selectEmpList(Criteria searchVO) throws Exception;
	int selectEmpListTotCnt(Criteria searchVO);    
	void insert(EmpVO empVO) throws Exception;  
	EmpVO selectEmp(int eno) throws Exception;     
	void update(EmpVO empVO) throws Exception;  
	void delete(EmpVO empVO) throws Exception;  
}




