/**
 * 
 */
package com.simplecoding.simplemapper.gallery.controller;

import com.simplecoding.simplemapper.common.Criteria;
import com.simplecoding.simplemapper.gallery.service.GalleryService;
import com.simplecoding.simplemapper.gallery.vo.GalleryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
public class GalleryController {

	@Autowired
    GalleryService galleryService;

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
	public String insert(@RequestParam(defaultValue = "") String galleryTitle,
							@RequestParam(required = false) MultipartFile image
			) throws Exception {
		GalleryVO galleryVO = new GalleryVO(galleryTitle, image.getBytes());
		galleryService.insert(galleryVO);
		return "redirect:/gallery"; 
	}
	
	@GetMapping("/gallery/download")
	@ResponseBody
	public ResponseEntity<byte[]> findDownload(@RequestParam(defaultValue = "") String uuid) {
		GalleryVO galleryVO = galleryService.selectGallery(uuid);
		
        HttpHeaders headers = new HttpHeaders();             
        headers.setContentDispositionFormData("attachment", galleryVO.getUuid()); 
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);              

        return new ResponseEntity<byte[]>(galleryVO.getGalleryData(), headers, HttpStatus.OK);
	}
	
	@PostMapping("/gallery/delete")
	public String delete(@RequestParam(defaultValue = "") String uuid) {
		galleryService.delete(uuid);
		return "redirect:/gallery";
	}
}
