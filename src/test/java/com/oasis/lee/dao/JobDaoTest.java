package com.oasis.lee.dao;

import com.oasis.lee.dao.pojo.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class JobDaoTest {
    @Autowired
    JobDao jobDao;

    @Test
    public void findEmp() {
        for(Emp emp:jobDao.findEmp("manage")){
            System.err.println(emp);
        }
    }
}