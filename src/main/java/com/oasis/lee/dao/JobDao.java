package com.oasis.lee.dao;

import com.oasis.lee.dao.pojo.Emp;
import com.oasis.lee.dao.pojo.Job;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JobDao {
    int deleteByPrimaryKey(Integer jno);

    int insert(Job record);

    int insertSelective(Job record);

    Job selectByPrimaryKey(Integer jno);

    int updateByPrimaryKeySelective(Job record);

    int updateByPrimaryKey(Job record);

    List<Job> findAll();

    List<Job> findByName(@Param("jname") String jname);

    List<Emp> findEmp(@Param("jname") String jname);
}