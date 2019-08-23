package com.oasis.lee.action;

import com.oasis.lee.commons.Result;
import com.oasis.lee.commons.ResultJSON;
import com.oasis.lee.dao.pojo.Emp;
import com.oasis.lee.service.iservice.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("emp")
public class EmpAction {
    @Autowired
    EmpService empService;

    @RequestMapping(value = "emp",method = RequestMethod.POST)
    public @ResponseBody ResultJSON<Emp> save(Emp emp) {
        String msg =empService.save(emp);
        int code =Result.SUCCESS.equals(msg)?200:500;
        return new ResultJSON<Emp>(code,msg);
    }
    @RequestMapping(value = "emp/{eno}",method = RequestMethod.DELETE)
    public @ResponseBody ResultJSON<Emp> delete(Integer emo) {
        String msg =empService.delete(emo);
        int code =Result.SUCCESS.equals(msg)?200:500;
        return new ResultJSON<Emp>(code,msg);
    }
    @RequestMapping(value = "update",method = RequestMethod.POST)
    public @ResponseBody ResultJSON<Emp> update(Emp emp) {
        String msg =empService.update(emp);
        int code =Result.SUCCESS.equals(msg)?200:500;
        return new ResultJSON<Emp>(code,msg);
    }

    @RequestMapping(value = "findById/{eno}",method = RequestMethod.GET)
    public @ResponseBody ResultJSON<Emp> findById(@PathVariable("eno") Integer eno) {
        Emp emp = empService.findById(eno);
        if (emp != null) {
            return new ResultJSON<Emp>(200,Result.SUCCESS,emp);
        } else {
            return new ResultJSON<Emp>(404,Result.ERROR);
        }
    }
    @RequestMapping(value = "findByPage")
    public @ResponseBody ResultJSON<List<Emp>> findByPage(
            @RequestParam(value = "page",required = false,defaultValue = "1") int page,
            @RequestParam(value = "size",required = false,defaultValue = "3")int size) {
        List<Emp> emps = empService.findByPage(page,size);
        if (emps != null && emps.size() > 0) {
            return new ResultJSON<List<Emp>>(200,Result.SUCCESS,emps);
        } else {
            return new ResultJSON<List<Emp>>(404,Result.ERROR);
        }
    }
    @RequestMapping(value = "findByName/{ename}")
    public @ResponseBody ResultJSON<List<Emp>> findByPage(@PathVariable("ename") String ename) {
        List<Emp> emps = empService.findByName(ename);
        if (emps != null && emps.size() > 0) {
            return new ResultJSON<List<Emp>>(200,Result.SUCCESS,emps);
        } else {
            return new ResultJSON<List<Emp>>(404,Result.ERROR);
        }
    }
    @RequestMapping(value = "findByEmp/{dname}")
    public @ResponseBody ResultJSON<List<Emp>> findByEmp(@PathVariable("dname") String dname) {
        List<Emp> emps = empService.findByEmp(dname);
        if (emps != null && emps.size() > 0) {
            return new ResultJSON<List<Emp>>(200,Result.SUCCESS,emps);
        } else {
            return new ResultJSON<List<Emp>>(404,Result.ERROR);
        }
    }

}