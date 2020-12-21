/* 
 * 文件名：SysParameterService.java  
 * 版权：Copyright 2016-2017 炎宝网络科技  All Rights Reserved by
 * 修改人：邱深友  
 * 创建时间：2017年6月15日
 * 版本号：v1.0
*/
package com.qzi.cms.server.service.web;

import com.qzi.cms.common.resp.Paging;
import com.qzi.cms.common.vo.SysAdminSumVo;
import com.qzi.cms.common.vo.SysParameterVo;

import java.util.List;

/**
 * 参数设置业务层接口
 * @author qsy
 * @version v1.0
 * @date 2017年6月15日
 */
public interface AdminSumService {

	/**
	 * 查找所有数据
	 * @param paging 分页
	 * @return 集合
	 * @throws Exception 
	 */
	public List<SysAdminSumVo> findAll(Paging paging) throws Exception;



	/**
	 * 查找总记录数
	 * @return
	 */
	public long findCount();
	
}
