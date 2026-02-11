package com.simplecoding.simplemapper.qna.mapper;

import com.simplecoding.simplemapper.common.Criteria;
import com.simplecoding.simplemapper.qna.vo.Qna;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface QnaMapper {
    List<?> selectQnaList(Criteria criteria);
    int selectQnaListTotCnt(Criteria criteria);
    int insert(Qna qna);
    Qna selectQna(int qno);
    int update(Qna qna);
    int delete(Qna qna);
}
