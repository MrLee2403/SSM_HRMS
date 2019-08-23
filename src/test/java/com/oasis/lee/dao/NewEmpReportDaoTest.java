package com.oasis.lee.dao;

import com.oasis.lee.dao.pojo.NewEmpDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class NewEmpReportDaoTest {
    @Autowired
    NewEmpReportDao newEmpReport;

    @Test
    public void findByTime() {
        List<NewEmpDTO> infos = newEmpReport.findByTime("2019-08-01","2019-08-31");
        for(NewEmpDTO info:infos){
            System.err.println(info);
        }


    }
}