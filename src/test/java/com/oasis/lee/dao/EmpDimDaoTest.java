package com.oasis.lee.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class EmpDimDaoTest {
@Autowired
    EmpDimDao empDimDao;
    @Test
    public void findAll() {
        System.err.println(empDimDao.findAll());
    }

    @Test
    public void findByType() {
        System.err.println(empDimDao.findByType("a"));
    }


    @Test
    public void findEmp() {
        System.err.println("*************************"+empDimDao.findEmp(1004));
    }
}