package com.oasis.lee.service.iservice;

import com.oasis.lee.dao.pojo.HrmReportDTO;

import java.util.List;

public interface HrmReportService {
    List<HrmReportDTO> findByTime(String beginTime, String endTime);
}
