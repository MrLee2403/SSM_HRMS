package com.oasis.lee.dao;

import com.oasis.lee.dao.pojo.EmpPro;

import java.util.List;

public interface EmpProDao {
    int deleteByPrimaryKey(Integer eno);

    int insert(EmpPro record);

    int insertSelective(EmpPro record);

    EmpPro selectByPrimaryKey(Integer eno);

    int updateByPrimaryKeySelective(EmpPro record);

    int updateByPrimaryKey(EmpPro record);

    List<EmpPro> findAll();
}