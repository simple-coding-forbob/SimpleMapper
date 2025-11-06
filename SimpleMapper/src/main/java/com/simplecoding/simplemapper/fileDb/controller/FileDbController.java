/**
 * 
 */
package com.simplecoding.simplemapper.fileDb.controller;

import com.simplecoding.simplemapper.common.Criteria;
import com.simplecoding.simplemapper.fileDb.service.FileDbService;
import com.simplecoding.simplemapper.fileDb.vo.FileDbVO;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
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

@Log4j2
@Controller
public class FileDbController {

	@Autowired
    FileDbService fileDbService;

	@GetMapping("/fileDb")
	public String selectFileDbList(@ModelAttribute Criteria criteria, Model model) {

        criteria.setPageOffset(criteria.getPage());       // Offset 자동 계산

		List<?> fileDBs = fileDbService.selectFileDbList(criteria);
		model.addAttribute("fileDBs", fileDBs);
		
		int totCnt = fileDbService.selectFileDbListTotCnt(criteria);
        criteria.calculateTotalPage(totCnt);
        model.addAttribute("criteria", criteria);
		
		return "fileDb/fileDb_all";
	}

//	추가 페이지 열기 :
	@GetMapping("/fileDb/addition")
	public String createFileDbView() {
		return "fileDb/add_fileDb";
	}
	
	@PostMapping("/fileDb/add")
	public String insert(@RequestParam(defaultValue = "") String fileTitle,
							@RequestParam(defaultValue = "") String fileContent,
							@RequestParam(required = false) MultipartFile image
			) throws Exception {
		FileDbVO fileDbVO = new FileDbVO(fileTitle, fileContent, image.getBytes());
		fileDbService.insert(fileDbVO);
		return "redirect:/fileDb"; 
	}
	
	@GetMapping("/fileDb/download")
	@ResponseBody
	public ResponseEntity<byte[]> findDownload(@RequestParam(defaultValue = "") String uuid) {
		FileDbVO fileDbVO = fileDbService.selectFileDb(uuid);
		
        HttpHeaders headers = new HttpHeaders();             
        headers.setContentDispositionFormData("attachment", fileDbVO.getUuid()); 
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);              

        return new ResponseEntity<byte[]>(fileDbVO.getFileData(), headers, HttpStatus.OK);
	}
	
	@PostMapping("/fileDb/delete")
	public String delete(@RequestParam(defaultValue = "") String uuid) {
		log.info("테스트 : " + uuid);
		fileDbService.delete(uuid);
		return "redirect:/fileDb"; 
	}
}









