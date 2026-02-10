package com.simplecoding.simplemapper.fileDb.mapper;


import com.simplecoding.simplemapper.common.Criteria;
import com.simplecoding.simplemapper.fileDb.vo.FileDb;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FileDbMapper {
	List<?> selectFileDbList(Criteria searchVO);   
	int selectFileDbListTotCnt(Criteria searchVO); 
	int insert(FileDb fileDb);
	int delete(String uuid);                       
}