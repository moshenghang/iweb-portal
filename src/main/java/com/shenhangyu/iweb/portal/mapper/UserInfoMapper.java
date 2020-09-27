/**
 * 版权所有©深航渔
 */
package com.shenhangyu.iweb.portal.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.shenhangyu.iweb.portal.bean.CardInfoBean;
import com.shenhangyu.iweb.portal.bean.UserInfoBean;


/**
 *描述：
 *@author moshenghang
 *@create 2020/4/14 0014 21:35
 */
@Mapper
public interface UserInfoMapper {
	
	/**
	 * 查询全部卡号信息
	 * @return List<CardInfoBean>
	 */
	List<UserInfoBean> selectAllUserInfoBeans();
	
	/**
	 * 插入卡信息
	 * @return
	 */
    boolean insertICardInfo();
    
    /**
     * 查询卡信息
     * @return
     */
    UserInfoBean queryUserInfo(String loginAccount);
}
