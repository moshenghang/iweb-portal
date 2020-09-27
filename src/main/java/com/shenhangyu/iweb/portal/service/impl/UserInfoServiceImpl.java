/**
 * 版权所有©深航渔
 */
package com.shenhangyu.iweb.portal.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shenhangyu.iweb.portal.bean.UserInfoBean;
import com.shenhangyu.iweb.portal.mapper.UserInfoMapper;
import com.shenhangyu.iweb.portal.service.UserInfoService;


/**
 *描述：
 *@author moshenghang
 *@create 2020/4/13 0013 20:17
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
	
	private static Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);
	
	@Autowired
	private UserInfoMapper userInfoMapper;
	
	@Override
    public List<UserInfoBean> queryUserInfos(){
    	logger.info("进入查询全部用户信息服务层..........");
    	List<UserInfoBean> cards = new ArrayList<UserInfoBean>();
    	cards=userInfoMapper.selectAllUserInfoBeans();
        return cards;
    }

	@Override
	public UserInfoBean getUserInfoBean(String loginAccount) {
		logger.info("进入查询单个用户信息服务层..........");
		UserInfoBean bean = userInfoMapper.queryUserInfo(loginAccount);
		return bean;
	}
}
