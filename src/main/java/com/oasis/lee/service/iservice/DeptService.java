package com.oasis.lee.service.iservice;

import com.oasis.lee.dao.pojo.Dept;

import java.util.List;

public interface DeptService {
   String save(Dept dept);
   String delete(Integer dno);
   String update(Dept dept);
    Dept findById(Integer dno);
   List<Dept> findByPage(int page ,int size);
   List<Dept> findByName(String dname);
   List<Dept> findByDeptType(String dtype);



}
