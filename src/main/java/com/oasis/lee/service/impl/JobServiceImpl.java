package com.oasis.lee.service.impl;

import com.github.pagehelper.PageHelper;
import com.oasis.lee.commons.Result;
import com.oasis.lee.dao.JobDao;
import com.oasis.lee.dao.pojo.Emp;
import com.oasis.lee.dao.pojo.Job;

import com.oasis.lee.service.iservice.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("jobService")
public class JobServiceImpl implements JobService {
    @Autowired
    JobDao jobDao;
    @Override
    public String save(Job job) {
        int result =jobDao.insertSelective(job);
        return result>0? Result.SUCCESS:Result.ERROR;
    }

    @Override
    public String delete(Integer jno) {
        int result =jobDao.deleteByPrimaryKey(jno);
        return result>0?Result.SUCCESS:Result.SUCCESS;
    }

    @Override
    public String update(Job job) {
        int result =jobDao.updateByPrimaryKeySelective(job);
        return result>0?Result.SUCCESS:Result.ERROR;
    }

    @Override
    public List<Job> findByName(String jname) {

        return jobDao.findByName(jname);
    }

    @Override
    public List<Job> findByPage(int page, int size) {
        PageHelper.startPage(page,size);
        return jobDao.findAll();
    }

    @Override
    public Job findById(Integer id) {
        return jobDao.selectByPrimaryKey(id);
    }

    @Override
    public List<Emp> findEmp(String jname) {
        return jobDao.findEmp(jname);


    }
}
