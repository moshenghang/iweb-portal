package com.shenhangyu.iweb.portal.bean;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * 用户信息表
 * 
 * @author moshenghang
 * @email com.moshenghang@gmail.com
 * @date 2020-05-11 19:58:50
 */
@ApiModel(description="用户卡号信息封装类")
public class UserInfoBean implements Serializable{
	private static final long serialVersionUID = 1L;
	@ApiModelProperty(value="user_info表id")
	private Integer userId;
	@ApiModelProperty(value="用户名")
	private String userName;
	@ApiModelProperty(value="登录账号")
	private String loginAccount;
	@ApiModelProperty(value="登录密码")
	private String loginPassword;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLoginAccount() {
		return loginAccount;
	}
	public void setLoginAccount(String loginAccount) {
		this.loginAccount = loginAccount;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	@Override
	public String toString() {
		return "UserInfoBean [userId=" + userId + ", userName=" + userName + ", loginAccount=" + loginAccount
				+ ", loginPassword=" + loginPassword + "]";
	}
	
}
