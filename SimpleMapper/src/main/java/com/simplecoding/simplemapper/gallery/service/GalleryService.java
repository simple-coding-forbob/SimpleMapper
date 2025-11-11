/**
 *
 */
package com.simplecoding.simplemapper.gallery.service;

import com.simplecoding.simplemapper.common.CommonUtil;
import com.simplecoding.simplemapper.common.Criteria;
import com.simplecoding.simplemapper.gallery.mapper.GalleryMapper;
import com.simplecoding.simplemapper.gallery.vo.GalleryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class GalleryService {

    @Autowired
    GalleryMapper galleryMapper;
    @Autowired
    private CommonUtil commonUtil;

    public List<?> selectGalleryList(Criteria searchVO) {
        return galleryMapper.selectGalleryList(searchVO);
    }


    public int selectGalleryListTotCnt(Criteria searchVO) {
        return galleryMapper.selectGalleryListTotCnt(searchVO);
    }


    public void insert(GalleryVO galleryVO) throws Exception {
        String uuid = UUID.randomUUID().toString();                             // 1) UUID 만들기(기본키): 자바에서 중복안되게 만들어주는 글자(랜덤)
        galleryVO.setUuid(uuid);
        if (galleryVO.getFileData() != null) {
            String downloadURL = commonUtil.generateUrl("gallery", uuid);   // 2) 업로드 파일이 있을때만 다운로드 URL 만들기
            galleryVO.setGalleryFileUrl(downloadURL);
            commonUtil.saveFile(galleryVO.getFileData(), uuid);                 // 3) 업로드 파일이 있을때만 파일 만들기
        }

        galleryMapper.insert(galleryVO);
    }

    public GalleryVO selectGallery(String uuid) {
        GalleryVO galleryVO = galleryMapper.selectGallery(uuid);
        return galleryVO;
    }


    public void delete(String uuid) {
        commonUtil.deleteFile(uuid);                       // 1) 업로드 폴더에 파일 삭제하기
        galleryMapper.delete(uuid);
    }
}






