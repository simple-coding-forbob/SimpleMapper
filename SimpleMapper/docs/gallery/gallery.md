# Gallery 게시판
## Gallery 게시판 주소: http://localhost:8080/gallery
## 스프링 코딩 순서: 1) vo 2) mapper 3) xml 4) service 5) controller 6) jsp
## Gallery 테이블: TB_GALLERY

# 기능별 코딩 순서
## 1. Gallery 전체 조회
### 1) TB_GALLERY 2) Gallery -> 3) GalleryMapper(selectGalleryList) -> 4) Gallery.xml(selectGalleryList) 
   -> 5) GalleryService(selectGalleryList) -> 6) GalleryController(selectGalleryList,/gallery) -> 7) gallery/gallery_all.jsp(fn_search)

## 2. Gallery 전체 조회에 페이지번호 넣기
### 1) GalleryMapper(selectGalleryListTotCnt) -> 2) Gallery.xml(selectGalleryListTotCnt)
   -> 3) GalleryService(selectGalleryListTotCnt) -> 4) GalleryController(selectGalleryList,/gallery) -> 5) gallery/gallery_all.jsp(twbsPagination)

## 3. Gallery 추가
### 1) GalleryMapper(insert) -> 2) Gallery.xml(insert)
-> 3) GalleryService(insert) -> 4) GalleryController(createGalleryView,/gallery/addition),(insert,/gallery/add) -> 5) gallery/add_gallery.jsp(fn_save)

## 4. Gallery 이미지 다운로드(pc에서 이미지 가져오기)
### 1) GalleryController(fileDownload,/download/gallery)

## 5. Gallery 삭제
### 1) GalleryMapper(delete) -> 2) Gallery.xml(delete)
-> 3) GalleryService(delete) -> 4) GalleryController(delete,/gallery/delete) -> 5) gallery/gallery_all.jsp(fn_delete)