package egovframework.example.emp.service;

import java.util.List;

import egovframework.example.common.Criteria;

public interface EmpService {
	List<?> selectEmpList(Criteria criteria);
	int selectEmpListTotCnt(Criteria criteria);    
	void insert(EmpVO empVO);  
	EmpVO selectEmp(int eno);     
	void update(EmpVO empVO);  
	void delete(EmpVO empVO);  
}




