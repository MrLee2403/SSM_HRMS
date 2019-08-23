package com.oasis.lee.service.impl;

import com.github.pagehelper.PageHelper;
import com.oasis.lee.commons.Result;
import com.oasis.lee.dao.EmpDao;
import com.oasis.lee.dao.pojo.Emp;
import com.oasis.lee.service.iservice.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("empService")
public class EmpServiceImpl implements EmpService {
    @Autowired
    EmpDao empDao;
    @Override
    public String save(Emp emp) {
        int result = empDao.insertSelective(emp);
        return result > 0 ? Result.SUCCESS:Result.ERROR;
    }

    @Override
    public String update(Emp emp) {
        int result = empDao.updateByPrimaryKeySelective(emp);
        return result > 0 ?Result.SUCCESS:Result.ERROR;
    }

    @Override
    public String delete(Integer eno) {
        int result = empDao.deleteByPrimaryKey(eno);
        return result > 0 ?Result.SUCCESS:Result.ERROR;
    }

    @Override
    public List<Emp> findByPage(int page, int size) {
        PageHelper.startPage(page, size);
        return empDao.findAll();
    }

    @Override
    public List<Emp> findByName(String ename) {
        return empDao.findByName(ename);
    }

    @Override
    public Emp findById(Integer eno) {
        return empDao.selectByPrimaryKey(eno);
    }

    @Override
    public List<Emp> findByEmp(String dname) {
        return empDao.findByEmp(dname);
    }
}
