package com.oasis.lee.action;

import com.oasis.lee.commons.Result;
import com.oasis.lee.commons.ResultJSON;
import com.oasis.lee.dao.pojo.EmpPro;

import com.oasis.lee.service.iservice.EmpProService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("empPro")
public class EmpProAction {

    @Autowired
    EmpProService empProService;

    @RequestMapping(value = "empPro", method = RequestMethod.POST)
    public @ResponseBody
    ResultJSON<EmpPro> save(EmpPro empPro) {
        String msg = empProService.save(empPro);
        System.err.println(msg);
        int code = Result.SUCCESS.equals(msg) ? 200 : 500;
        return new ResultJSON<EmpPro>(code, msg);
    }

    @RequestMapping(value = "empProDel/{eno}", method = RequestMethod.DELETE)
    public @ResponseBody
    ResultJSON<EmpPro> delete(@PathVariable("eno") Integer eno) {
        String msg = empProService.delete(eno);
        int code = Result.SUCCESS.equals(msg) ? 200 : 500;
        return new ResultJSON<EmpPro>(code, msg);
    }

    @RequestMapping(value = "empProUp", method = RequestMethod.POST)
    public @ResponseBody
    ResultJSON<EmpPro> update(EmpPro empPro) {
        String msg = empProService.update(empPro);
        int code = Result.SUCCESS.equals(msg) ? 200 : 500;
        return new ResultJSON<EmpPro>(code, msg);
    }

    @RequestMapping("empPros")
    public @ResponseBody ResultJSON<List<EmpPro>> findByPage(@RequestParam(value = "page", required = false, defaultValue = "1") int page, @RequestParam(value = "size", required = false, defaultValue = "4") int size) {
        List<EmpPro> emps = empProService.findByPage(page, size);
        if (emps != null && emps.size() > 0) {
            return new ResultJSON<List<EmpPro>>(200, Result.SUCCESS, emps);
        } else {
            return new ResultJSON<List<EmpPro>>(500, Result.ERROR);
        }
    }
    @RequestMapping("empPro/{eno}")
    public @ResponseBody ResultJSON<EmpPro> findById(@PathVariable(value = "eno")Integer eno) {
        EmpPro emps = empProService.findById(eno);
        if (emps != null ) {
            return new ResultJSON<EmpPro>(200, Result.SUCCESS,emps);
        } else {
            return new ResultJSON<EmpPro>(500, Result.ERROR);
        }
    }
}