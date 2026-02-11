package com.simplecoding.simplemapper.qna.service;

import com.simplecoding.simplemapper.common.Criteria;
import com.simplecoding.simplemapper.qna.mapper.QnaMapper;
import com.simplecoding.simplemapper.qna.vo.Qna;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QnaService {

    @Autowired
    private QnaMapper qnaMapper;

    public List<?> selectQnaList(Criteria criteria) {
        return qnaMapper.selectQnaList(criteria);
    }


    public int selectQnaListTotCnt(Criteria criteria) {
        return qnaMapper.selectQnaListTotCnt(criteria);
    }


    public void insert(Qna qna) {
        qnaMapper.insert(qna);
    }


    public Qna selectQna(int qno) {
        Qna qna = qnaMapper.selectQna(qno);
        return qna;
    }


    public void update(Qna qna) {
        qnaMapper.update(qna);
    }


    public void delete(Qna qna) {
        qnaMapper.delete(qna);
    }
}
