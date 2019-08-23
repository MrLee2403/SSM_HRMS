package com.oasis.lee.dao;

import com.oasis.lee.dao.pojo.NewEmpDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewEmpReportDao {
   List<NewEmpDTO> findByTime(@Param("beginTime")String beginTime,@Param("endTime")String endTime);

}
