/* 
 * 文件名：LoginVo.java  
 * 版权：Copyright 2016-2016 炎宝网络科技  All Rights Reserved by
 * 修改人：邱深友  
 * 创建时间：2016年11月27日
 * 版本号：v1.0
*/
package com.qzi.cms.common.vo;

/**
 * 用户登录信息
 * @author qsy
 * @version v1.0
 * @date 2016年11月27日
 */
public class SysAdminSumVo {
	private String communityId;
	private String communityNo;
	private String communityName;
	private String totalcount;
	private String sumcount;

	public String getCommunityId() {
		return communityId;
	}

	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

	public String getCommunityNo() {
		return communityNo;
	}

	public void setCommunityNo(String communityNo) {
		this.communityNo = communityNo;
	}

	public String getCommunityName() {
		return communityName;
	}

	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}

	public String getTotalcount() {
		return totalcount;
	}

	public void setTotalcount(String totalcount) {
		this.totalcount = totalcount;
	}

	public String getSumcount() {
		return sumcount;
	}

	public void setSumcount(String sumcount) {
		this.sumcount = sumcount;
	}
}
