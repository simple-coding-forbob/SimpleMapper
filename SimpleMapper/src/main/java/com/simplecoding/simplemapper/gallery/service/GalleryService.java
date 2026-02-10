/**
 *
 */
package com.simplecoding.simplemapper.gallery.service;

import com.simplecoding.simplemapper.common.CommonUtil;
import com.simplecoding.simplemapper.common.Criteria;
import com.simplecoding.simplemapper.gallery.mapper.GalleryMapper;
import com.simplecoding.simplemapper.gallery.vo.Gallery;
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


    public void insert(Gallery gallery) throws Exception {
        String uuid = UUID.randomUUID().toString();                            // 1) UUID 만들기(기본키): 자바에서 중복안되게 만들어주는 글자(랜덤)
        gallery.setUuid(uuid);
        if (gallery.getFileData().getSize() > 0) {                           // 첨부파일을 업로드하지 않으면 크기가 0임(즉 이미지를 업로드 했을때만)
            String downloadURL = commonUtil.generateUrl("gallery", uuid); // 2) 업로드 파일이 있을때만 다운로드 URL 만들기
            gallery.setGalleryFileUrl(downloadURL);
            commonUtil.saveFile(gallery.getFileData(), uuid);                // 3) 업로드 파일이 있을때만 파일 만들기
        }

        galleryMapper.insert(gallery);
    }

    public void delete(String uuid) {
        commonUtil.deleteFile(uuid);                       // 1) 업로드 폴더에 파일 삭제하기
        galleryMapper.delete(uuid);
    }
}






