package egovframework.example.gallery.service;

import java.util.List;

import egovframework.example.common.Criteria;

public interface GalleryService {
	List<?> selectGalleryList(Criteria criteria); 
	int selectGalleryListTotCnt(Criteria criteria);                
	void insert(GalleryVO galleryVO);      
	GalleryVO selectGallery(String uuid);          
	void delete(String uuid);  
}






