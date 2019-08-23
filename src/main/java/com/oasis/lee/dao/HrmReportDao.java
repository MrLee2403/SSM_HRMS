package com.oasis.lee.dao;

import com.oasis.lee.dao.pojo.HrmReportDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HrmReportDao {
    List<HrmReportDTO> findByTime(@Param("beginTime")String beginTime, @Param("endTime")String endTime);

}
