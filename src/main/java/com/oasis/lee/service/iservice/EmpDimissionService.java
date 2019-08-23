package com.oasis.lee.service.iservice;

import com.oasis.lee.dao.pojo.Emp;
import com.oasis.lee.dao.pojo.EmpDim;

import java.util.List;

public interface EmpDimissionService {
    String save(EmpDim dim);

    String delete(int eno);

    String update(EmpDim dim);

    List<EmpDim> findByPage(int page,int size);

    List<EmpDim> findByType(String edtype);

    EmpDim findById(Integer eno);

    Emp findEmp(Integer eno);
}
