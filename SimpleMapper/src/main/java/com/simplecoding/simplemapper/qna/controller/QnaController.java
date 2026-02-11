package com.simplecoding.simplemapper.qna.controller;

import com.simplecoding.simplemapper.common.Criteria;
import com.simplecoding.simplemapper.qna.service.QnaService;
import com.simplecoding.simplemapper.qna.vo.Qna;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Log4j2
@Controller
public class QnaController {

    @Autowired
    private QnaService qnaService;

    @GetMapping("/qna")
    public String selectQnaList(
            @ModelAttribute Criteria criteria,
            Model model) {
        criteria.setPageOffset(criteria.getPage());

        List<?> qnas = qnaService.selectQnaList(criteria);
        log.info("qnas : "+qnas);
        model.addAttribute("qnas", qnas);

        int totCnt = qnaService.selectQnaListTotCnt(criteria);
        criteria.calculateTotalPage(totCnt);

        log.info("totCnt : "+totCnt);
        model.addAttribute("criteria", criteria);

        return "qna/qna_all";
    }

    //	추가 페이지 열기 함수
    @GetMapping("/qna/addition")
    public String createQnaView() {
        return "qna/add_qna";
    }

    @PostMapping("/qna/add")
    public String insert(@ModelAttribute Qna qna) {

        log.info("테스트 " + qna);
        qnaService.insert(qna);

        return "redirect:/qna";
    }

    @GetMapping("/qna/edition")
    public String updateQnaView(@RequestParam int qno, Model model)
    {
        Qna qna = qnaService.selectQna(qno);
        model.addAttribute("qna", qna);
        return "qna/update_qna";
    }

    @PostMapping("/qna/edit")
    public String update(@RequestParam int qno,
                         @ModelAttribute Qna qna
    ) {
        qnaService.update(qna);
        return "redirect:/qna";
    }

    @PostMapping("/qna/delete")
    public String delete(@ModelAttribute Qna qna)
    {
        qnaService.delete(qna);
        return "redirect:/qna";
    }
}
