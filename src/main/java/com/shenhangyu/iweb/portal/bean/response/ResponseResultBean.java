package com.shenhangyu.iweb.portal.bean.response;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * 响应结果类
 * 
 * @author moshenghang
 * @email com.moshenghang@gmail.com
 * @date 2020-05-11 19:58:50
 */
@ApiModel(description="响应结果封装类")
public class ResponseResultBean implements Serializable {
	private static final long serialVersionUID = 1L;
	@ApiModelProperty(value="响应码")
	private String resultCode;
	@ApiModelProperty(value="响应信息")
	private String resultMsg;
	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultMsg() {
		return resultMsg;
	}
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	@Override
	public String toString() {
		return "ResponseResult [resultCode=" + resultCode + ", resultMsg=" + resultMsg + "]";
	}
	
}
