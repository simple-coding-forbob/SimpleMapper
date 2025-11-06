package com.simplecoding.simplemapper.fileDb.service;

import com.simplecoding.simplemapper.common.Criteria;
import com.simplecoding.simplemapper.fileDb.mapper.FileDbMapper;

import com.simplecoding.simplemapper.fileDb.vo.FileDbVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;
import java.util.UUID;

@Service
public class FileDbService {

	@Autowired
    FileDbMapper fileDbMapper;

	
	public List<?> selectFileDbList(Criteria searchVO) {
		return fileDbMapper.selectFileDbList(searchVO);
	}
	
	
	public int selectFileDbListTotCnt(Criteria searchVO) {
		return fileDbMapper.selectFileDbListTotCnt(searchVO);
	}
	
	
	public void insert(FileDbVO fileDbVO) {
		    String newUuid = UUID.randomUUID().toString(); 
		    String fileDownloadURL = generateDownloadUrl(newUuid);
		    fileDbVO.setUuid(newUuid);
		    fileDbVO.setFileUrl(fileDownloadURL);
		    
		    fileDbMapper.insert(fileDbVO);
	}
	
	public String generateDownloadUrl(String uuid) {
        return ServletUriComponentsBuilder      
          .fromCurrentContextPath()
          .path("/fileDb/download")
          .query("uuid="+uuid)
          .toUriString();
	}
	
	
	public FileDbVO selectFileDb(String uuid) {
		FileDbVO fileDbVO = fileDbMapper.selectFileDb(uuid);
		return fileDbVO;
	}
	
	
	public void delete(String uuid) {
		fileDbMapper.delete(uuid);
	}
}

