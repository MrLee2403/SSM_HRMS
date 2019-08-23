package com.oasis.lee.action;

import com.oasis.lee.commons.Result;
import com.oasis.lee.commons.ResultJSON;
import com.oasis.lee.dao.pojo.Dept;

import com.oasis.lee.service.iservice.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("dept")
public class DeptAction {

    @Autowired
    DeptService deptService;

    @RequestMapping(value = "save",method = RequestMethod.POST)
    public @ResponseBody
    ResultJSON<Dept> save(Dept dept){
        String msg = deptService.save(dept);
        int code = Result.SUCCESS.equals(msg)?200:404;
        return  new ResultJSON<>(code,msg);
    }

    @RequestMapping(value = "update",method = RequestMethod.POST)
    public @ResponseBody ResultJSON<Dept> update(Dept dept){
        String msg = deptService.update(dept);
        int code = Result.SUCCESS.equals(msg)?200:404;
        return  new ResultJSON<>(code,msg);
    }

    @RequestMapping(value = "delete/{dno}",method = RequestMethod.DELETE)
    public @ResponseBody  ResultJSON<Dept> detele(@PathVariable("dno") int dno){
        String msg = deptService.delete(dno);
        int code = Result.SUCCESS.equals(msg)?200:404;
        return  new ResultJSON<>(code,msg);
    }

    @RequestMapping(value = "findById/{dno}",method = RequestMethod.GET)
    public @ResponseBody ResultJSON<Dept> findById(@PathVariable("dno") Integer dno){
        Dept dept= deptService.findById(dno);
        if(dept!=null){
            return new ResultJSON<>(200,Result.SUCCESS,dept);
        }else {
            return new ResultJSON<>(500,Result.ERROR);
        }
    }
    @RequestMapping(value = "findByName/{dname}",method = RequestMethod.GET)
    public  @ResponseBody ResultJSON<List<Dept>> findByName(@PathVariable("dname") String dname){
        List<Dept> depts=deptService.findByName(dname);
        if(depts!=null&&depts.size()>0){
            return new ResultJSON<>(200,Result.SUCCESS,depts);
        }else{
            return  new ResultJSON<>(500,Result.ERROR);
        }
    }
    @RequestMapping(value = "findByDeptType/{dtype}",method = RequestMethod.GET)
    public  @ResponseBody ResultJSON<List<Dept>> findByDeptType(@PathVariable("dtype") String dtype){
        List<Dept> depts=deptService.findByDeptType(dtype);
        if(depts!=null&&depts.size()>0){
            return new ResultJSON<>(200,Result.SUCCESS,depts);
        }else{
            return  new ResultJSON<>(500,Result.ERROR);
        }
    }

    @RequestMapping(value = "findByPage",method = RequestMethod.GET)
    public @ResponseBody ResultJSON<List<Dept>> findByPage(
            @RequestParam(value = "page",required = false,defaultValue = "1") int page,
            @RequestParam(value = "size",required = false,defaultValue = "5") int size
    ){
        List<Dept> depts = deptService.findByPage(page,size);
        if(depts!=null&&depts.size()>0){
            return new ResultJSON<>(200,Result.SUCCESS,depts);
        }else {
            return  new ResultJSON<>(500,Result.ERROR);
        }


    }
}
