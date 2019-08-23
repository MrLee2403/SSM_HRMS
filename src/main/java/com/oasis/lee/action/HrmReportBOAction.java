package com.oasis.lee.action;

import com.oasis.lee.dao.pojo.HrmReportBO;
import com.oasis.lee.service.iservice.HrmReportBOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("hrmReprotBO")
public class HrmReportBOAction {
    @Autowired
    HrmReportBOService hrmReportBOService;

    //    @RequestMapping("findByTime")
//    public @ResponseBody
//    ResultJSON<List<HrmReportBO>> findByTime(
//            @RequestParam(value = "beginTime") String beginTime,
//            @RequestParam(value = "endTime") String endTime
//    ) {
//        List<HrmReportBO> info = hrmReportBOService.findByTime(beginTime, endTime);
//
//        if (info != null && info.size() > 0) {
//            return new ResultJSON<List<HrmReportBO>>(200, Result.SUCCESS, info);
//        } else {
//            return new ResultJSON<>(500, Result.ERROR);
//        }
//    }

    /**
     * freemarker 人事报表  对应webapp下demo.ftl
     * @param map
     * @param beginTime
     * @param endTime
     * @return
     */
    @RequestMapping("demo.do")
    public String findByTime(
            Map<String, Object> map,
            @RequestParam(value = "beginTime") String beginTime,
            @RequestParam(value = "endTime") String endTime
    ) {

        List<HrmReportBO> info = hrmReportBOService.findByTime(beginTime, endTime);

       map.put("m1", info);

        return "demo";

    }
}
