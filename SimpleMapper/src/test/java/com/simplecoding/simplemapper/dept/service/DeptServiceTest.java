package com.simplecoding.simplemapper.dept.service;

import com.simplecoding.simplemapper.common.Criteria;
import com.simplecoding.simplemapper.dept.vo.DeptVO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Log4j2
class DeptServiceTest {

    @Autowired
    private DeptService deptService;

    @Test
    void selectDeptList() {
        Criteria criteria = new Criteria();
        criteria.setSearchKeyword("");
        criteria.setOffset(3);
        criteria.setSize(3);
        List<?> list= deptService.selectDeptList(criteria);
        log.info(list);
    }

    @Test
    void selectDeptListTotCnt() {
        Criteria criteria = new Criteria();
        criteria.setSearchKeyword("");
        criteria.setPage(0);
        criteria.setSize(3);
        int count= deptService.selectDeptListTotCnt(criteria);
        log.info(count);
    }

    @Test
    void insert() {
        DeptVO deptVO = new DeptVO();
        deptVO.setDname("개발");
        deptVO.setLoc("부산");
        deptService.insert(deptVO);
    }

    @Test
    void selectDept() {

        DeptVO deptVO = deptService.selectDept(10);
        log.info(deptVO);
    }

    @Test
    void update() {
        DeptVO deptVO = new DeptVO();
        deptVO.setDno(10);
        deptVO.setDname("개발");
        deptVO.setLoc("부산");
        deptService.update(deptVO);
    }

    @Test
    void delete() {
        DeptVO deptVO = new DeptVO();
        deptVO.setDno(10);
        deptService.delete(deptVO);        
    }
}