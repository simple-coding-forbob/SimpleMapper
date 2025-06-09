package egovframework.example.fileDb.service.impl;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import egovframework.example.common.Criteria;
import egovframework.example.fileDb.service.FileDbVO;

@Mapper
public interface FileDbMapper {
	public List<?> selectFileDbList(Criteria criteria);   
	public int selectFileDbListTotCnt(Criteria criteria); 
	public int insert(FileDbVO fileDbVO);                 
	public FileDbVO selectFileDb(String  uuid);           
	public int delete(String uuid);                       
}





