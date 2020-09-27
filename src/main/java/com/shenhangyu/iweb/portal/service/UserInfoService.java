/**
 *版权所有©深航渔渔渔
 */
package com.shenhangyu.iweb.portal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shenhangyu.iweb.portal.bean.UserInfoBean;


/**
 * 描述:用户信息接口
 *
 * @author moshenghang
 * @create 2020/4/13 0013 20:15
 */
@Service
public interface UserInfoService {
	
	public UserInfoBean getUserInfoBean(String loginAccount);
	
    public List<UserInfoBean> queryUserInfos();
}
