package com.oasis.lee.action;

import com.oasis.lee.commons.Result;
import com.oasis.lee.commons.ResultJSON;
import com.oasis.lee.dao.pojo.NewEmpDTO;
import com.oasis.lee.service.iservice.NewEmpReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class NewEmpAction {
    @Autowired
    NewEmpReportService newEmpReportService;
    @RequestMapping("findByTime")
    public @ResponseBody
   ResultJSON<List<NewEmpDTO>> findByTime(
            @RequestParam(value = "beginTime")String beginTime,
            @RequestParam(value = "endTime")String endTime
    ) {
        List<NewEmpDTO> info = newEmpReportService.findByTime(beginTime, endTime);
        System.err.println(info);
        if (info != null && info.size() > 0) {
            return new ResultJSON<List<NewEmpDTO>>(200, Result.SUCCESS, info);
        } else {
            return  new ResultJSON<>(500,Result.ERROR);
        }
    }

}
