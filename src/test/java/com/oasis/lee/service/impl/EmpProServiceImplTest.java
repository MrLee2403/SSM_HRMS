package com.oasis.lee.service.impl;

import com.oasis.lee.dao.pojo.EmpPro;

import com.oasis.lee.service.iservice.EmpProService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class EmpProServiceImplTest {
    @Autowired
    EmpProService empProService;

    @Test
    public void findByPage() {
        List<EmpPro> findByPage=empProService.findByPage(1,4);
        for (EmpPro empPro:findByPage){
            System.err.println(empPro);
        }
    }


    @Test
    public void findById() {
        System.err.println(empProService.findById(1));
    }

    @Test
    public void save() {
       EmpPro emppro = new EmpPro(7,new Date(),new Date(),"dddd");
        String result = empProService.save(emppro);
        System.err.println(result);
    }

    @Test
    public void delete() {
    }

    @Test
    public void update() {
        EmpPro emppro = new EmpPro(7,new Date(),new Date(),"dddd");
        String result = empProService.update(emppro);
        System.err.println(result);
    }
}