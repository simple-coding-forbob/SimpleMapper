package com.simplecoding.simplemapper.dept.service;

import com.simplecoding.simplemapper.common.Criteria;
import com.simplecoding.simplemapper.dept.vo.Dept;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

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
        Dept dept = new Dept();
        dept.setDname("개발");
        dept.setLoc("부산");
        deptService.insert(dept);
    }

    @Test
    void selectDept() {

        Dept dept = deptService.selectDept(10);
        log.info(dept);
    }

    @Test
    void update() {
        Dept dept = new Dept();
        dept.setDno(10);
        dept.setDname("개발");
        dept.setLoc("부산");
        deptService.update(dept);
    }

    @Test
    void delete() {
        Dept dept = new Dept();
        dept.setDno(10);
        deptService.delete(dept);
    }
}