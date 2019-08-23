package com.oasis.lee.service.impl;

import com.oasis.lee.dao.pojo.Dept;
import com.oasis.lee.service.iservice.DeptService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class DeptServiceImplTest {
    @Autowired
    DeptService deptService;

    @Test
    public void save() {
        Dept dept = new Dept(5,"wcs","sale","15041143291",new Date(), 1);
        String result = deptService.save(dept);
        System.err.println(result);

    }

    @Test
    public void delete() {
        String result = deptService.delete(5);
        System.err.println(result);
    }

    @Test
    public void update() {
        Dept dept = new Dept(5,"wcs","sale","18888888888",new Date(), 1);
        String result = deptService.update(dept);
        System.err.println(result);
    }

    @Test
    public void findByPage() {
        List<Dept> depts = deptService.findByPage(1,2);
        for(Dept dept: depts){
            System.err.println(dept);
        }

    }

    @Test
    public void findByName() {
        List<Dept> depts = deptService.findByName("e");
        for(Dept dept:depts){
            System.err.println(dept);
        }
    }

    @Test
    public void findById() {
        Dept dept  = deptService.findById(2);
        System.err.println(dept);
    }
    @Test
    public void findByDeptType(){
        List<Dept> depts =deptService.findByDeptType("c");
        for (Dept dept:depts){
            System.err.println(dept);
        }
    }


}