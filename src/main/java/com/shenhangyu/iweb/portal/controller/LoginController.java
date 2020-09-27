package com.shenhangyu.iweb.portal.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.shenhangyu.iweb.portal.bean.UserInfoBean;
import com.shenhangyu.iweb.portal.bean.response.ResponseResultBean;
import com.shenhangyu.iweb.portal.service.CardInfoService;
import com.shenhangyu.iweb.portal.service.UserInfoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * 版权所有©深航渔
 *卡信息查询Contraller
 * @author Administrator
 * @create 2020-04-12 14:49
 */
@Api(tags="卡号信息相关接口")
@RestController
@RequestMapping("/check")
public class LoginController {
	private static Logger logger = LoggerFactory.getLogger(LoginController.class);
	@Autowired(required = false)
	private UserInfoService userInfoService;
    @ApiOperation(value = "校验用户登录信息",notes="校验用户登录信息",httpMethod="GET",response=String.class)
    @GetMapping("/getLogin")
    public JSONObject checkLoginWithGet(@ModelAttribute UserInfoBean userInfo){
    	ResponseResultBean responseResultBean = new ResponseResultBean();
    	if(null == userInfo){
    		responseResultBean.setResultCode("300");
    		responseResultBean.setResultMsg("请求参数为空");
    		return JSONObject.parseObject(JSONObject.toJSONString(responseResultBean));
    	}
    	logger.info("获取到的请求数据："+userInfo.toString());
    	String loginAccount = userInfo.getLoginAccount();
    	if(null == loginAccount){
    		responseResultBean.setResultCode("301");
    		responseResultBean.setResultMsg("登录账号不能为空");
    		return JSONObject.parseObject(JSONObject.toJSONString(responseResultBean));
    	}
    	UserInfoBean userInfoDB = userInfoService.getUserInfoBean(loginAccount);
    	if(null == userInfoDB){
    		responseResultBean.setResultCode("302");
    		responseResultBean.setResultMsg("登录账号不存在");
    		return JSONObject.parseObject(JSONObject.toJSONString(responseResultBean));
    	}
    	String loginPassword = userInfo.getLoginPassword();
    	String loginPasswordDB = userInfoDB.getLoginPassword();
    	if(null == loginPassword || null == loginPasswordDB){
    		responseResultBean.setResultCode("303");
    		responseResultBean.setResultMsg("登录密码不能为空");
    		return JSONObject.parseObject(JSONObject.toJSONString(responseResultBean));
    	}
    	if(loginPassword.equals(loginPasswordDB)){
    		responseResultBean.setResultCode("200");
    		responseResultBean.setResultMsg("登录校验成功");
    	}else{
    		responseResultBean.setResultCode("400");
    		responseResultBean.setResultMsg("登录密码错误");
    	}
    	return JSONObject.parseObject(JSONObject.toJSONString(responseResultBean));
    }
    
	@ApiOperation(value = "校验用户登录信息",notes="校验用户登录信息",httpMethod="POST",response=UserInfoBean.class)
    @PostMapping("/postLogin")
    public JSONObject checkLoginWithPost(@ApiParam(name="json",value="请求参数为Json对象")@RequestBody JSONObject json){
    	ResponseResultBean responseResultBean = new ResponseResultBean();
    	if(null == json){
    		responseResultBean.setResultCode("300");
    		responseResultBean.setResultMsg("请求参数为空");
    		return JSONObject.parseObject(JSONObject.toJSONString(responseResultBean));
    	}
    	logger.info("获取到的请求数据："+json.toString());
    	String loginAccount = json.getString("loginAccount");
    	if(null == loginAccount){
    		responseResultBean.setResultCode("301");
    		responseResultBean.setResultMsg("登录账号不能为空");
    		return JSONObject.parseObject(JSONObject.toJSONString(responseResultBean));
    	}
    	UserInfoBean userInfoDB = userInfoService.getUserInfoBean(loginAccount);
    	if(null == userInfoDB){
    		responseResultBean.setResultCode("302");
    		responseResultBean.setResultMsg("登录账号不存在");
    		return JSONObject.parseObject(JSONObject.toJSONString(responseResultBean));
    	}
    	String loginPassword = json.getString("loginPassword");
    	String loginPasswordDB = userInfoDB.getLoginPassword();
    	if(null == loginPassword || null == loginPasswordDB){
    		responseResultBean.setResultCode("303");
    		responseResultBean.setResultMsg("登录密码不能为空");
    		return JSONObject.parseObject(JSONObject.toJSONString(responseResultBean));
    	}
    	if(loginPassword.equals(loginPasswordDB)){
    		responseResultBean.setResultCode("200");
    		responseResultBean.setResultMsg("登录校验成功");
    	}else{
    		responseResultBean.setResultCode("201");
    		responseResultBean.setResultMsg("登录密码错误");
    	}
    	return JSONObject.parseObject(JSONObject.toJSONString(responseResultBean));
    }
}
