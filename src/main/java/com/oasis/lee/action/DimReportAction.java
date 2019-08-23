package com.oasis.lee.action;

import com.oasis.lee.commons.Result;
import com.oasis.lee.commons.ResultJSON;
import com.oasis.lee.dao.pojo.DimDTO;
import com.oasis.lee.service.iservice.DimReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DimReportAction {
    @Autowired
    DimReportService dimReportService;

    @RequestMapping("finddim")
    public @ResponseBody
    ResultJSON<List<DimDTO>> findDim(
            @RequestParam(value = "begin") String begin,
            @RequestParam(value = "end") String end) {
        List<DimDTO> lists = dimReportService.findDim(begin, end);
        if (lists != null && lists.size() > 0) {
            return new ResultJSON<List<DimDTO>>(200, Result.SUCCESS, lists);
        } else {
            return new ResultJSON<List<DimDTO>>(404, Result.ERROR);
        }
    }


}
