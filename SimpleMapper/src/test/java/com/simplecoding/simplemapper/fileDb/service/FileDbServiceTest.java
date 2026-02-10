package com.simplecoding.simplemapper.fileDb.service;

import com.simplecoding.simplemapper.common.Criteria;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Log4j2
class FileDbServiceTest {

    @Autowired
    private FileDbService fileDbService;

    @Test
    void selectFileDbList() {
        Criteria criteria = new Criteria();
        criteria.setSearchKeyword("");
        criteria.setPage(0);
        criteria.setSize(3);
        List<?> list = fileDbService.selectFileDbList(criteria);
        log.info(list);
    }

    @Test
    void selectFileDbListTotCnt() {
        Criteria criteria = new Criteria();
        criteria.setSearchKeyword("");
        criteria.setPage(0);
        criteria.setSize(3);
        int count = fileDbService.selectFileDbListTotCnt(criteria);
        log.info(count);
    }

    @Test
    void delete() {
        fileDbService.delete("12345671");
    }
}