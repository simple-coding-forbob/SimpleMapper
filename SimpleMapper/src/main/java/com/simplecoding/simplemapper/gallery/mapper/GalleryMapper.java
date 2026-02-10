package com.simplecoding.simplemapper.gallery.mapper;


import com.simplecoding.simplemapper.common.Criteria;
import com.simplecoding.simplemapper.gallery.vo.Gallery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GalleryMapper {
	List<?> selectGalleryList(Criteria searchVO);   
	int selectGalleryListTotCnt(Criteria searchVO); 
	int insert(Gallery gallery);
	Gallery selectGallery(String  uuid);
	int delete(String uuid);                       
}





