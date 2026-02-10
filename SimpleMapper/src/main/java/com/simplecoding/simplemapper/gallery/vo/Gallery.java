package com.simplecoding.simplemapper.gallery.vo;

import com.simplecoding.simplemapper.common.Criteria;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Gallery extends Criteria {
	private String uuid;           // 기본키
	private String galleryTitle;   // 제목
	private MultipartFile fileData;   // 내부적 사용(이미지)
	private String galleryFileUrl="https://placehold.co/600x400";     // 서버에 저장된 파일 URL
}




