package com.oasis.lee.service.iservice;

import com.oasis.lee.dao.pojo.HrmReportBO;

import java.util.List;

public interface HrmReportBOService {
    List<HrmReportBO> findByTime(String beginTime,String endTime);
}
