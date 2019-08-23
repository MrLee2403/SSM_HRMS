package com.oasis.lee.dao;


import com.oasis.lee.dao.pojo.DimDTO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DimReportDao {
    List<DimDTO> findDim(@Param("begin") String begin,@Param("end") String end);
}
