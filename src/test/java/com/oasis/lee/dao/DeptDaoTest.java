package com.oasis.lee.dao;

import com.oasis.lee.dao.pojo.Dept;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")

public class DeptDaoTest {
    @Autowired
    DeptDao deptDao;

    @Test
    public void deleteByPrimaryKey() {
        System.err.println(deptDao.deleteByPrimaryKey(5));
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {

    }

    @Test
    public void selectByPrimaryKey() {
        System.err.println(deptDao.selectByPrimaryKey(1));
    }

    @Test
    public void updateByPrimaryKeySelective() {


    }

    @Test
    public void updateByPrimaryKey() {
    }

    @Test
    public void findAll() {
        for(Dept dept:deptDao.findAll()){
            System.err.println(dept);
        }
    }

    @Test
    public void findByName() {
        for (Dept dept:deptDao.findByName("a")){
            System.err.println(dept);
        }
    }

    @Test
    public void findByDeptType() {
        for(Dept dept:deptDao.findByDeptType("c")){
            System.err.println(dept);
        }
    }
}