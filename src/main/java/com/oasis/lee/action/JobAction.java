package com.oasis.lee.action;

import com.oasis.lee.commons.Result;
import com.oasis.lee.commons.ResultJSON;
import com.oasis.lee.dao.pojo.Emp;
import com.oasis.lee.dao.pojo.Job;

import com.oasis.lee.service.iservice.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("job")
public class JobAction {
    @Autowired
    JobService jobService;
    @RequestMapping(value = "job", method = RequestMethod.POST)
    public @ResponseBody ResultJSON<Job> save(Job job){
        String msg =jobService.save(job);
        int code = Result.SUCCESS.equals(msg)?200:500;
        return new ResultJSON<Job>(code, msg);
    }
    @RequestMapping(value = "jobDel/{jno}", method = RequestMethod.DELETE)
    public @ResponseBody ResultJSON<Job> delete(Integer jno){
        String msg =jobService.delete(jno);
        int code = Result.SUCCESS.equals(msg)?200:500;
        return new ResultJSON<Job>(code, msg);
    }
    @RequestMapping(value = "jobUp", method = RequestMethod.POST)
    public @ResponseBody ResultJSON<Job> update(Job job){
        String msg =jobService.update(job);
        int code = Result.SUCCESS.equals(msg)?200:500;
        return new ResultJSON<Job>(code, msg);
    }
    @RequestMapping("jobs")
    public @ResponseBody ResultJSON<List<Job>> findByPage(@RequestParam(value = "page", required = false, defaultValue = "1") int page, @RequestParam(value = "size", required = false, defaultValue = "4") int size) {
        List<Job> jobs = jobService.findByPage(page, size);
        if (jobs != null && jobs.size() > 0) {
            return new ResultJSON<List<Job>>(200, Result.SUCCESS, jobs);
        } else {
            return new ResultJSON<List<Job>>(500, Result.ERROR);
        }
    }
        @RequestMapping("job/{jno}")
    public @ResponseBody ResultJSON<Job> findById(@PathVariable("jno")Integer jno) {
        Job jobs = jobService.findById(jno);
        if (jobs != null) {
            return new ResultJSON<Job>(200, Result.SUCCESS, jobs);
        } else {
            return new ResultJSON<Job>(500, Result.ERROR);
        }
    }
    @RequestMapping("jobs/{jname}")
    public @ResponseBody ResultJSON<List<Job>> findByName(@PathVariable("jname")String jname) {
        List<Job> jobs = jobService.findByName(jname);
        if (jobs != null && jobs.size()>0) {
            return new ResultJSON<List<Job>>(200, Result.SUCCESS, jobs);
        } else {
            return new ResultJSON<List<Job>>(500, Result.ERROR);
        }
    }
    @RequestMapping("job_emp/{jname}")
    public @ResponseBody
    ResultJSON<List<Emp>> findEmp(@PathVariable("jname")String jname){
        List<Emp> emps = jobService.findEmp(jname);
        if(emps!=null&&emps.size()>0){
            return new ResultJSON<List<Emp>>(200,Result.SUCCESS,emps);
        }else{
            return new ResultJSON<List<Emp>>(500, Result.ERROR);
        }
    }
}
