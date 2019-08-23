package com.oasis.lee.action;

import com.oasis.lee.commons.Result;
import com.oasis.lee.commons.ResultJSON;
import com.oasis.lee.dao.pojo.HrmReportDTO;
import com.oasis.lee.service.iservice.HrmReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("hrmReprot")
public class HrmReportAction {

    @Autowired
    HrmReportService hrmReportService;

    @RequestMapping("findByTime")
    public @ResponseBody
    ResultJSON<List<HrmReportDTO>> findByTime(
            @RequestParam(value = "beginTime") String beginTime,
            @RequestParam(value = "endTime") String endTime
    ) {
        List<HrmReportDTO> info = hrmReportService.findByTime(beginTime, endTime);
        System.err.println(info);
        if (info != null && info.size() > 0) {
            return new ResultJSON<List<HrmReportDTO>>(200, Result.SUCCESS, info);
        } else {
            return new ResultJSON<>(500, Result.ERROR);
        }
    }

}
