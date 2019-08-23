package com.oasis.lee.action;

import com.oasis.lee.commons.Result;
import com.oasis.lee.commons.ResultJSON;
import com.oasis.lee.dao.pojo.Emp;
import com.oasis.lee.dao.pojo.EmpDim;
import com.oasis.lee.service.iservice.EmpDimissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmpDimAction {
    @Autowired
    EmpDimissionService empDimissionService;
    @RequestMapping(value = "dimsave",method= RequestMethod.POST)
    public @ResponseBody ResultJSON<EmpDim> save(EmpDim dim){
        String msg = empDimissionService.save(dim);
        int code = Result.SUCCESS.equals(msg)?200:404;
        return new ResultJSON<EmpDim>(code,msg);
    }
  @RequestMapping(value = "dimupdate",method = RequestMethod.POST)
    public @ResponseBody ResultJSON<EmpDim> update(EmpDim dim){
        String msg = empDimissionService.update(dim);
        int code = Result.SUCCESS.equals(msg)?200:404;
        return new ResultJSON<EmpDim>(code,msg);
  }
  @RequestMapping(value = "dimdelete/{eno}",method = RequestMethod.DELETE)
    public @ResponseBody ResultJSON<EmpDim> delete(@PathVariable("eno") Integer eno){
        String msg = empDimissionService.delete(eno);
        int code = Result.SUCCESS.equals(msg)?200:404;
        return new ResultJSON<EmpDim>(code,msg);
  }
  @RequestMapping("empdims")
    public @ResponseBody ResultJSON<List<EmpDim>> findByPage(
            @RequestParam(value = "page",required = false,defaultValue = "1") int page,
            @RequestParam(value = "size",required = false,defaultValue = "4") int size){
            List<EmpDim> lists = empDimissionService.findByPage(page,size);
            if(lists!=null&&lists.size()>0){
                return  new ResultJSON<List<EmpDim>>(200,Result.SUCCESS,lists);
            }else{
                return  new ResultJSON<List<EmpDim>>(404,Result.ERROR);
            }
  }
  @RequestMapping("findtype/{edtype}")
    public @ResponseBody ResultJSON<List<EmpDim>> findType(@PathVariable("edtype") String edtype){
    List<EmpDim> lists = empDimissionService.findByType(edtype);
    if(lists!=null&&lists.size()>0){
        return  new ResultJSON<List<EmpDim>>(200,Result.SUCCESS,lists);
    }else{
        return  new ResultJSON<List<EmpDim>>(404,Result.ERROR);
    }
  }
  @RequestMapping("findid/{eno}")
    public @ResponseBody ResultJSON<EmpDim> findById(@PathVariable("eno")Integer eno){
    EmpDim dim = empDimissionService.findById(eno);
    if(dim!=null){
        return new ResultJSON<EmpDim>(200,Result.SUCCESS,dim);
    }else{
        return new ResultJSON<EmpDim>(404,Result.ERROR);
    }
  }
    @RequestMapping("findemp/{eno}")
    public @ResponseBody ResultJSON<Emp> findByEmp(@PathVariable("eno")Integer eno){
        Emp dim = empDimissionService.findEmp(eno);
        if(dim!=null){
            return new ResultJSON<Emp>(200,Result.SUCCESS,dim);
        }else{
            return new ResultJSON<Emp>(404,Result.ERROR);
        }
    }
}
