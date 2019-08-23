package com.oasis.lee.dao;

import com.oasis.lee.dao.pojo.HrmReportBO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HrmRepotBODao {
    List<HrmReportBO> findByTime(@Param("beginTime") String beginTime,@Param("endTime")String endTime);

}
