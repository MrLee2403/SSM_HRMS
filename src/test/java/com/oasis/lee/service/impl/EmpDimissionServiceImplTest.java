package com.oasis.lee.service.impl;

import com.oasis.lee.dao.pojo.EmpDim;
import com.oasis.lee.service.iservice.EmpDimissionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")

public class EmpDimissionServiceImplTest {
@Autowired
EmpDimissionService empDimissionService;
    @Test
    public void save() {
        EmpDim dim = new EmpDim(1006,new Date(),"yyyy","mmmm");
        System.err.println(empDimissionService.save(dim));
    }

    @Test
    public void delete() {

        System.err.println(empDimissionService.delete(1006));
    }

    @Test
    public void update() {
        EmpDim dim = new EmpDim(1006,new Date(),"wangwang","didi");
        System.err.println(empDimissionService.update(dim));
    }

    @Test
    public void findByPage() {
        List<EmpDim> lists = empDimissionService.findByPage(1,2);
        for(EmpDim dims:lists){
            System.err.println(dims);
        }

    }

    @Test
    public void findByType() {
        List<EmpDim> lists = empDimissionService.findByType("a");
        for(EmpDim dims:lists){
            System.err.println(dims);
        }
    }

    @Test
    public void findById() {
        System.err.println(empDimissionService.findById(1006));
    }

    @Test
    public void findEmp() {
        System.err.println(empDimissionService.findEmp(1001));
    }
}