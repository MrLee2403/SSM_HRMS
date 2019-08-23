package com.oasis.lee.service.impl;

import com.oasis.lee.dao.pojo.Emp;
import com.oasis.lee.service.iservice.EmpService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class EmpServiceImplTest {

    @Autowired
    EmpService empService;
    @Test
    public void save() {
        Emp emp = new Emp(1004,2,3,"Sheng","female", new Date(),"150428199810250992","college",new Date(),new Date(),"onjob","regular","soceity");
        String result = empService.save(emp);
        System.err.println(result);
    }

    @Test
    public void update() {
        Emp emp = new Emp(1004,2,3,"ShengEr","female", new Date(),"150428199810250992","college",new Date(),new Date(),"onjob","regular","soceity");
        String result = empService.update(emp);
        System.err.println(result);
    }

    @Test
    public void delete() {
        String result = empService.delete(1004);
        System.err.println(result);
    }

    @Test
    public void findByPage() {
        List<Emp> emps = empService.findByPage(1,2);
        for (Emp emp : emps) {
            System.err.println(emp);
        }
    }

    @Test
    public void findByName() {
        List<Emp> emps = empService.findByName("u");
        for (Emp emp : emps) {
            System.err.println(emp);
        }
    }

    @Test
    public void findById() {
        Emp emp = empService.findById(1001);
        System.err.println(emp);
    }

    @Test
    public void findByEmp() {
        List<Emp> emps = empService.findByEmp("develop");
        for (Emp emp : emps) {
            System.err.println(emp);
        }
    }
}