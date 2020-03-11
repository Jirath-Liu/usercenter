package com.kelab.usercenter.serivce;

import com.kelab.info.base.PaginationResult;
import com.kelab.info.base.query.PageQuery;
import com.kelab.info.context.Context;
import com.kelab.info.usercenter.LoginResult;
import com.kelab.info.usercenter.UserInfo;
import com.kelab.usercenter.constant.enums.TimeType;
import com.kelab.usercenter.resultVO.SingleResult;

public interface UserInfoService {

    LoginResult login(Context context, String username, String password, String verifyCode, String uuid);


    LoginResult register(Context context, UserInfo userInfo);

    /**
     * 查询全部用户数量
     */
    SingleResult<Integer> queryTotal(Context context);

    /**
     * 获取用户提交排名
     */
    PaginationResult<UserInfo> submitStatistic(Context context, PageQuery pageQuery, TimeType timeType);

}
