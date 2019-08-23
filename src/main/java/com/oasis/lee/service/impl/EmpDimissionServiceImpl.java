package com.oasis.lee.service.impl;

import com.github.pagehelper.PageHelper;
import com.oasis.lee.commons.Result;
import com.oasis.lee.dao.EmpDimDao;
import com.oasis.lee.dao.pojo.Emp;
import com.oasis.lee.dao.pojo.EmpDim;
import com.oasis.lee.service.iservice.EmpDimissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("dimissionService")
public class EmpDimissionServiceImpl implements EmpDimissionService {
@Autowired
    EmpDimDao empDimDao;
    @Override
    public String save(EmpDim dim) {
        int result = empDimDao.insertSelective(dim);
        return result>0? Result.SUCCESS:Result.ERROR;
    }

    @Override
    public String delete(int eno) {
       int result = empDimDao.deleteByPrimaryKey(eno);
        return result>0? Result.SUCCESS:Result.ERROR;
    }

    @Override
    public String update(EmpDim dim) {
       int result = empDimDao.updateByPrimaryKeySelective(dim);
        return result>0? Result.SUCCESS:Result.ERROR;
    }

    @Override
    public List<EmpDim> findByPage(int page, int size) {
        PageHelper.startPage(page, size);
        return empDimDao.findAll();
    }

    @Override
    public List<EmpDim> findByType(String edtype) {

        return empDimDao.findByType(edtype);
    }

    @Override
    public EmpDim findById(Integer eno) {

        return empDimDao.selectByPrimaryKey(eno);
    }

    @Override
    public Emp findEmp(Integer eno) {
        return empDimDao.findEmp(eno);
    }
}
