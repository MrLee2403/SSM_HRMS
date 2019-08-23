package com.oasis.lee.dao;

import com.oasis.lee.dao.pojo.Emp;
import com.oasis.lee.dao.pojo.EmpDim;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpDimDao {
    int deleteByPrimaryKey(Integer eno);

    int insert(EmpDim record);

    int insertSelective(EmpDim record);

    EmpDim selectByPrimaryKey(Integer eno);

    int updateByPrimaryKeySelective(EmpDim record);

    int updateByPrimaryKey(EmpDim record);

    List<EmpDim> findAll();

    List<EmpDim> findByType(String edtype);

    Emp findEmp(@Param("eno")Integer eno);

}