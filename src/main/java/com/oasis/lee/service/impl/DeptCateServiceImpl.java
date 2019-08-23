package com.oasis.lee.service.impl;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.oasis.lee.commons.ResponseCode;
import com.oasis.lee.commons.ResponseResult;
import com.oasis.lee.dao.DeptDao;
import com.oasis.lee.dao.pojo.Dept;
import com.oasis.lee.service.iservice.DeptCateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Set;

@Service("deptCateService")
public class DeptCateServiceImpl implements DeptCateService {
    Logger logger  = LoggerFactory.getLogger(DeptCateServiceImpl.class);
    @Autowired
    DeptDao deptDao;
    @Override
    public ResponseResult<List<Dept>> getChildParentCate(Integer deptId) {
        List<Dept> deptList = deptDao.selectDeptCateChildrenByParent(deptId);
        if (CollectionUtils.isEmpty(deptList)){
            logger.info("没找到当前公司的部门");
        }
        return ResponseResult.createBySuccess(ResponseCode.SUCCESS.getDesc(),deptList);
    }

    /**
     * 递归查询本节点的Id及孩子节点的Id
     * @param deptId
     * @return
     */
    @Override
    public ResponseResult<List<Integer>> selectDeptAndChildrenById(Integer deptId){
        Set<Dept> deptSet = Sets.newHashSet();
        findChildDept(deptSet,deptId);
        List<Integer> deptIdList = Lists.newArrayList();
        if (deptId!=null){
            for (Dept deptItem:deptSet){
                deptIdList.add(deptItem.getDno());
            }
        }
        return ResponseResult.createBySuccess(ResponseCode.SUCCESS.getDesc(),deptIdList);
    }

    /**
     * 递归算出子节点
     * @param deptSet
     * @param deptId
     * @return
     */

    private Set<Dept> findChildDept(Set<Dept> deptSet,Integer deptId){
        Dept dept = deptDao.selectByPrimaryKey(deptId);
        if (dept!= null){
            deptSet.add(dept);
        }
        //查询子节点
        List<Dept> deptList = deptDao.selectDeptCateChildrenByParent(deptId);
        for (Dept deptItem:deptList){
            findChildDept(deptSet,deptItem.getDno());
        }
        return deptSet;
    }

}
