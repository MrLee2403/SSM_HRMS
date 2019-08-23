package com.oasis.lee.service.impl;

import com.oasis.lee.commons.Const;
import com.oasis.lee.commons.ResponseResult;
import com.oasis.lee.dao.UserDao;
import com.oasis.lee.dao.pojo.User;
import com.oasis.lee.service.iservice.UserService;
import com.oasis.lee.utils.MD5Util;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    /**
     * 校验用户名是否存在
     * @param username
     * @return
     */
    @Override
    public ResponseResult userExist(String username) {
        int resultCount = userDao.userExist(username);
        return resultCount > 0 ? ResponseResult.createBySuccessMsg("用户名存在") : ResponseResult.createByErrorMsg("用户名不存在");
    }

    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    @Override
    public ResponseResult<User> login(String username, String password) {
        int resultCount = userDao.userExist(username);
        if (resultCount == 0) {
            return ResponseResult.createByErrorMsg("用户名不存在");
        }
        String md5password = MD5Util.MD5EncodeUtf8(password);
        User user = userDao.selectLogin(username, md5password);
        if (user == null) {
            return ResponseResult.createByErrorMsg("密码错误");
        }
        return ResponseResult.createBySuccess("登录成功", user);

    }

    /**
     * 根据传参 不同  校验username  and  Email
     * @param str
     * @param type
     * @return
     */
    public ResponseResult<String> registerCheck(String str, String type) {
        //校验是否为空
        if (StringUtils.isNoneBlank(type)) {
            //校验username
            if (Const.USERNAME.equals(type)) {
                int resultCount = userDao.userExist(str);
                if (resultCount > 0) {
                    return ResponseResult.createByErrorMsg("用户名已存在");
                }
            }
            //校验Emai
            if (Const.EMAIL.equals(type)) {
                int resultCount = userDao.checkEmail(str);
                if (resultCount > 0) {
                    return ResponseResult.createByErrorMsg("Email已存在");
                }
            }
        } else {
            return ResponseResult.createByErrorMsg("参数错误");
        }
        return ResponseResult.createBySuccessMsg("校验成功");

    }
    /**
     * 用户注册
     * @param  user
     * @return
     */
    @Override
    public ResponseResult<String> register(User user) {
        //判断参数类型
        //校验用户名
        ResponseResult usernameResult=this.registerCheck(user.getUsername(),Const.USERNAME);
        if(!usernameResult.isSuccess()){
            return usernameResult;
        }
        ResponseResult emailResult=this.registerCheck(user.getEmail(),Const.EMAIL);
        if(!emailResult.isSuccess()){
            return emailResult;
        }
        //检验Email
        int emailCheck= userDao.checkEmail(user.getEmail());
        if(emailCheck>0){
            return ResponseResult.createByErrorMsg("Email已存在");
        }
        //设置用户身份  普通用户 or 管理员
        user.setRole(Const.Role.ROLE_CUSTOMER);
        //password 转为 md5格式 存入数据库
        user.setPassword(MD5Util.MD5EncodeUtf8(user.getPassword()));
        //向数据库中插入数据
        int result =userDao.insert(user);
        if(result==0){
            return ResponseResult.createByErrorMsg("注册失败");
        }
        return ResponseResult.createBySuccessMsg("注册成功");

    }


}
