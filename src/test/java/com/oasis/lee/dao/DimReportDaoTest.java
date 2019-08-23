package com.oasis.lee.dao;

import com.oasis.lee.dao.pojo.DimDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class DimReportDaoTest {
    @Autowired
    DimReportDao dimReportDao;

    @Test
    public void findDim() {
        List<DimDTO> lists = dimReportDao.findDim("2019-08-01", "2019-08-31");
        for (DimDTO dims : lists) {
            System.err.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + dims);
        }
    }
}