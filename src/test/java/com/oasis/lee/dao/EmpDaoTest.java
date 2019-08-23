package com.oasis.lee.dao;

import com.oasis.lee.dao.pojo.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class EmpDaoTest {
    @Autowired
    EmpDao empDao;

    @Test
    public void deleteByPrimaryKey() {

    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {

    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }

    @Test
    public void findAll() {
        for (Emp emp : empDao.findAll()) {
            System.err.println(emp);
        }
    }

    @Test
    public void findByEmp() {
        for (Emp emp : empDao.findByEmp("develop")) {
            System.err.println(emp);
        }
    }
}