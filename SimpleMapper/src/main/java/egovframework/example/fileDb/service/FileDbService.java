/**
 * 
 */
package egovframework.example.fileDb.service;

import java.util.List;

import egovframework.example.common.Criteria;

public interface FileDbService {
	List<?> selectFileDbList(Criteria criteria); 
	int selectFileDbListTotCnt(Criteria criteria);                
	void insert(FileDbVO fileDbVO);        
	FileDbVO selectFileDb(String uuid);          
	void delete(String uuid);              
}









