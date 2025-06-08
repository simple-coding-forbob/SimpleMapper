package egovframework.example.gallery.service;

import java.util.List;

import egovframework.example.common.Criteria;

public interface GalleryService {
	List<?> selectGalleryList(Criteria searchVO) throws Exception; 
	int selectGalleryListTotCnt(Criteria searchVO);                
	void insert(GalleryVO galleryVO) throws Exception;      
	GalleryVO selectGallery(String uuid) throws Exception;          
	void delete(String uuid) throws Exception;  
}






