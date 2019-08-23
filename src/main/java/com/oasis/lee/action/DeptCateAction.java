package com.oasis.lee.action;

import com.oasis.lee.commons.Const;
import com.oasis.lee.commons.ResponseCode;
import com.oasis.lee.commons.ResponseResult;
import com.oasis.lee.dao.pojo.User;
import com.oasis.lee.service.iservice.DeptCateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/dept_cate/")
public class DeptCateAction {
    @Autowired
    DeptCateService deptCateService;
    @RequestMapping("get_dept.do")
    @ResponseBody
    public ResponseResult getChildParentCate(HttpSession session,@RequestParam(value = "deptId",defaultValue = "1") Integer deptId){
        User user = (User) session.getAttribute(Const.CURRENT_USER);
        if (user==null){
            return ResponseResult.createByError(ResponseCode.NEED_LOGIN.getCode(),"用户未登录，请登录");
        }
        return deptCateService.getChildParentCate(deptId);
    }
    @RequestMapping("get_deep_dept.do")
    @ResponseBody
    public  ResponseResult selectDeptAndChildrenById(HttpSession session,@RequestParam(value = "deptId",defaultValue = "1") Integer deptId){
        User user = (User) session.getAttribute(Const.CURRENT_USER);
        if (user == null) {
            return ResponseResult.createByError(ResponseCode.NEED_LOGIN.getCode(), "用户未登录，请登录");
        }
        return deptCateService.selectDeptAndChildrenById(deptId);
    }
}
