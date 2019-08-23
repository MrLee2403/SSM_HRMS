package com.oasis.lee.service.impl;

import com.oasis.lee.dao.pojo.Emp;
import com.oasis.lee.dao.pojo.Job;

import com.oasis.lee.service.iservice.JobService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class JobServiceImplTest {
    @Autowired
    JobService jobService;

    @Test
    public void save() {

    }

    @Test
    public void delete() {
    }

    @Test
    public void update() {
    }

    @Test
    public void findByName() {
        List<Job> findByName =jobService.findByName("a");
        for (Job find:findByName){
            System.err.println(find);
        }
    }

    @Test
    public void findByPage() {
        List<Job> findByPage=jobService.findByPage(1,4);
        for (Job find:findByPage){
            System.err.println(find);
        }
        }


    @Test
    public void findById() {
        System.err.println("$$$$$$$$$$$$$$$$$"+jobService.findById(1));
    }

    @Test
    public void findEmp() {
     List<Emp> emps = jobService.findEmp("sales");
     for(Emp emp:emps){
         System.err.println(emp);
     }
    }
}