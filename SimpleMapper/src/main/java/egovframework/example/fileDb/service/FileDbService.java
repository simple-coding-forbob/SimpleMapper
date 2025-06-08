/**
 * 
 */
package egovframework.example.fileDb.service;

import java.util.List;

import egovframework.example.common.Criteria;

public interface FileDbService {
	List<?> selectFileDbList(Criteria searchVO) throws Exception; 
	int selectFileDbListTotCnt(Criteria searchVO);                
	void insert(FileDbVO fileDbVO) throws Exception;        
	FileDbVO selectFileDb(String uuid) throws Exception;          
	void delete(String uuid) throws Exception;              
}









