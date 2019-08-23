package com.oasis.lee.service.iservice;

import com.oasis.lee.dao.pojo.NewEmpDTO;

import java.util.List;

public interface NewEmpReportService {
    List<NewEmpDTO>  findByTime(String beginTime,String endTime);
}
