/**
 * 
 */
package com.simplecoding.simplemapper.fileDb.controller;

import com.simplecoding.simplemapper.common.CommonUtil;
import com.simplecoding.simplemapper.common.Criteria;
import com.simplecoding.simplemapper.fileDb.service.FileDbService;
import com.simplecoding.simplemapper.fileDb.vo.FileDbVO;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;
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

@Log4j2
@Controller
public class FileDbController {

	@Autowired
    FileDbService fileDbService;
    @Autowired
    private CommonUtil commonUtil;

	@GetMapping("/fileDb")
	public String selectFileDbList(@ModelAttribute Criteria criteria, Model model) {

        criteria.setPageOffset(criteria.getPage());       // Offset 자동 계산

		List<?> fileDbs = fileDbService.selectFileDbList(criteria);
		model.addAttribute("fileDbs", fileDbs);
		
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
	public String insert(        @Valid @ModelAttribute FileDbVO fileDbVO,
                                 BindingResult result
			) throws Exception {
        commonUtil.checkBindingResult(result);
		fileDbService.insert(fileDbVO);
		return "redirect:/fileDb"; 
	}

// 이미지 인터넷 주소: http://localhost:8080/download/fileDb/이미지명(uuid)
// commonUtil.generateUrl("fileDb",uuid); 함수가 만듬(서비스에서 코딩됨)
	@GetMapping("/download/fileDb")
	@ResponseBody
	public ResponseEntity<byte[]> fileDownload(@RequestParam(defaultValue = "") String uuid) throws Exception {

        // pc에 저장된 파일 uuid(이미지명)로 가져오기
        byte[] file= commonUtil.readFile(uuid);

        // ContentDisposition 사용 (브라우저 호환성 보장) : 첨부파일 설명 만들기(이미지명 등)
        ContentDisposition contentDisposition = ContentDisposition.attachment()         // 첨부파일 설명 넣기 준비
                .filename(uuid, StandardCharsets.UTF_8)                                 // 이미지명(uuid)
                .build();                                                               // 위 설정 만듬

        return ResponseEntity.ok()                                                      // ok 신호(200번) ,
                .contentType(MediaType.APPLICATION_OCTET_STREAM)                        // 문서종류: 이진 파일(이미지, 동영상 등)
                .header(HttpHeaders.CONTENT_DISPOSITION, contentDisposition.toString()) // 위에서 만든 첨부파일 설명 넣기(이미지명 등)
                .body(file);                                                            // 실제 첨부파일(file)
	}
	
	@PostMapping("/fileDb/delete")
	public String delete(@RequestParam(defaultValue = "") String uuid) {
		log.info("테스트 : " + uuid);
		fileDbService.delete(uuid);
		return "redirect:/fileDb"; 
	}
}









