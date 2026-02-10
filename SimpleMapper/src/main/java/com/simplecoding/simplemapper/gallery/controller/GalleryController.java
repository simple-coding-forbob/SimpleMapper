/**
 * 
 */
package com.simplecoding.simplemapper.gallery.controller;

import com.simplecoding.simplemapper.common.CommonUtil;
import com.simplecoding.simplemapper.common.Criteria;
import com.simplecoding.simplemapper.gallery.service.GalleryService;
import com.simplecoding.simplemapper.gallery.vo.Gallery;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
import java.util.List;

@Controller
public class GalleryController {

	@Autowired
    GalleryService galleryService;
    @Autowired
    private CommonUtil commonUtil;

	@GetMapping("/gallery")
	public String selectGalleryList(@ModelAttribute Criteria criteria, Model model) {

        criteria.setPageOffset(criteria.getPage());       // Offset 자동 계산

		List<?> gallerys = galleryService.selectGalleryList(criteria);
		model.addAttribute("gallerys", gallerys);
		
		int totCnt = galleryService.selectGalleryListTotCnt(criteria);
        criteria.calculateTotalPage(totCnt);
        model.addAttribute("criteria", criteria);
		
		return "gallery/gallery_all";
	}
	
	@GetMapping("/gallery/addition")
	public String createGalleryView() {
		return "gallery/add_gallery";
	}
	
	@PostMapping("/gallery/add")
	public String insert(       @Valid @ModelAttribute Gallery gallery,
                                BindingResult result
			) throws Exception {
        commonUtil.checkBindingResult(result);
		galleryService.insert(gallery);
		return "redirect:/gallery"; 
	}
	
	@GetMapping("/download/gallery")
	@ResponseBody
	public ResponseEntity<byte[]> fileDownload(@RequestParam(defaultValue = "") String uuid) throws Exception {

        // 서버에 저장된 실제 파일 경로
        byte[] file= commonUtil.readFile(uuid);

        // ContentDisposition 사용 (브라우저 호환성 보장)
        ContentDisposition contentDisposition = ContentDisposition.attachment()
                .filename(uuid, StandardCharsets.UTF_8) // 실제 업로드한 파일명
                .build();

        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .header(HttpHeaders.CONTENT_DISPOSITION, contentDisposition.toString())
                .body(file);
	}
	
	@PostMapping("/gallery/delete")
	public String delete(@RequestParam(defaultValue = "") String uuid) {
		galleryService.delete(uuid);
		return "redirect:/gallery";
	}
}
