package com.oasis.lee.action;
;
import com.oasis.lee.commons.Const;
import com.oasis.lee.commons.ResponseResult;
import com.oasis.lee.dao.pojo.User;
import com.oasis.lee.service.iservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user/")
public class UserAction {
    @Autowired
    UserService userService;

    /**
     * 校验用户名是否存在
     * @param username
     * @return
     */
    @RequestMapping(value = "exist.do", method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult userExist(String username) {
        return userService.userExist(username);
    }

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "login.do", method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult<User> login(String username, String password) {
        return userService.login(username, password);
    }
    /**
     * login
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "login.do", method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult<User> login(String username, String password, HttpSession session) {
        ResponseResult<User> responseResult = userService.login(username, password);
        if (responseResult.isSuccess()) {
            session.setAttribute(Const.CURRENT_USER, responseResult.getCode());
        }
        return responseResult;
    }
    /**
     * 用户注册
     * @param user
     * @return
     */
    @RequestMapping(value = "register.do", method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult<String> register(User user) {
        return userService.register(user);
    }

    /**
     * 注册校验  username or email
     * @param str
     * @param type
     * @return
     */
    @RequestMapping(value = "check_valid.do", method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult<String> registerCheck(String str, String type) {
       return userService.registerCheck(str,type);
    }
}
