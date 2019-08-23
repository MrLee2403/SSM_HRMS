package com.oasis.lee.dao;

import com.oasis.lee.dao.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 检查用户名是否存在
     * @param username
     * @return
     */
    int userExist(String username);

    /**
     * 登录Login
     * @param username
     * @param password
     * @return
     */
    User selectLogin(@Param("username") String username,@Param("password") String password);

    /**
     * 校验Email
     * @param email
     * @return
     */
    int checkEmail(String email);



}