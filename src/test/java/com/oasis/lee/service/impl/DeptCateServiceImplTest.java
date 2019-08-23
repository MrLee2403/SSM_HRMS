package com.oasis.lee.service.impl;

import com.oasis.lee.commons.ResponseResult;
import com.oasis.lee.dao.pojo.Dept;
import com.oasis.lee.service.iservice.DeptCateService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class DeptCateServiceImplTest {
@Autowired
    DeptCateService deptCateService;
    @Test
    public void getChildParentCate() {
       ResponseResult <List<Dept>> deptList = deptCateService.getChildParentCate(1);
        System.err.println(deptList);

    }

    @Test
    public void selectDeptAndChildrenById() {
        ResponseResult<List<Integer>> responseResult = deptCateService.selectDeptAndChildrenById(1);
        System.err.println(responseResult);
    }
}