package com.oasis.lee.service.impl;

import com.oasis.lee.dao.DimReportDao;
import com.oasis.lee.dao.pojo.DimDTO;
import com.oasis.lee.service.iservice.DimReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

@Service("dimReportService")
public class DimReportServiceImpl implements DimReportService {
    @Autowired
    DimReportDao dimReportDao;

    @Override
    public List<DimDTO> findDim(String begin, String end) {
        System.err.println("####################################");
        if (begin != "" || end != "") {
            return dimReportDao.findDim(begin, end);
        } else {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

            //获取前月的第一天
            Calendar cal_1 = Calendar.getInstance();//获取当前日期
            cal_1.add(Calendar.MONTH, 0);
            cal_1.set(Calendar.DAY_OF_MONTH, 1);//设置为1号,当前日期既为本月第一天
            String firstDay = format.format(cal_1.getTime());
            begin = firstDay;
            System.err.println(begin+"-------------------------------");
            Calendar ca = Calendar.getInstance();
            ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));
            String last = format.format(ca.getTime());
            end = last;
            System.err.println(end+"----------------------------------");
            return dimReportDao.findDim(begin, end);

        }
    }
}
