package com.oasis.lee.service.iservice;

import com.oasis.lee.commons.ResponseResult;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface DeptCateService {
    ResponseResult getChildParentCate(Integer deptId);

    ResponseResult<List<Integer>> selectDeptAndChildrenById(Integer deptId);
}
