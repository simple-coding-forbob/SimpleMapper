/**
 * 
 */
package com.simplecoding.simplemapper.gallery.service;

import com.simplecoding.simplemapper.common.Criteria;
import com.simplecoding.simplemapper.gallery.mapper.GalleryMapper;
import com.simplecoding.simplemapper.gallery.vo.GalleryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;
import java.util.UUID;

@Service
public class GalleryService {
	
	@Autowired
    GalleryMapper galleryMapper;

	
	public List<?> selectGalleryList(Criteria searchVO) {
		return galleryMapper.selectGalleryList(searchVO);
	}
	
	
	public int selectGalleryListTotCnt(Criteria searchVO) {
		return galleryMapper.selectGalleryListTotCnt(searchVO);
	}
	
	
	public void insert(GalleryVO galleryVO) {
		    String newUuid = UUID.randomUUID().toString(); 
		    String fileDownloadURL = generateDownloadUrl(newUuid);
		    galleryVO.setUuid(newUuid);
		    galleryVO.setGalleryFileUrl(fileDownloadURL);
		    
		    galleryMapper.insert(galleryVO);
	}
	
	public String generateDownloadUrl(String uuid) {
        return ServletUriComponentsBuilder
          .fromCurrentContextPath()
          .path("/gallery/download.do")
          .query("uuid="+uuid)
          .toUriString();
	}
	
	
	public GalleryVO selectGallery(String uuid) {
		GalleryVO galleryVO = galleryMapper.selectGallery(uuid);
		return galleryVO;
	}
	
	
	public void delete(String uuid) {
		galleryMapper.delete(uuid);
	}
}






