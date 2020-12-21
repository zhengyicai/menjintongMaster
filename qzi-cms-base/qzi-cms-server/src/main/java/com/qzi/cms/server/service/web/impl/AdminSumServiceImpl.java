/* 
 * 文件名：SysParameterServiceImpl.java  
 * 版权：Copyright 2016-2017 炎宝网络科技  All Rights Reserved by
 * 修改人：邱深友  
 * 创建时间：2017年6月15日
 * 版本号：v1.0
*/
package com.qzi.cms.server.service.web.impl;

import com.qzi.cms.common.po.SysParameterPo;
import com.qzi.cms.common.resp.Paging;
import com.qzi.cms.common.util.ToolUtils;
import com.qzi.cms.common.util.YBBeanUtils;
import com.qzi.cms.common.vo.SysAdminSumVo;
import com.qzi.cms.common.vo.SysParameterVo;
import com.qzi.cms.server.mapper.SysAdminSumMapper;
import com.qzi.cms.server.mapper.SysParameterMapper;
import com.qzi.cms.server.service.web.AdminSumService;
import com.qzi.cms.server.service.web.ParameterService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * 参数设置业务层实现类
 * @author qsy
 * @version v1.0
 * @date 2017年6月15日
 */
@Service
public class AdminSumServiceImpl implements AdminSumService {
	@Resource
	private SysAdminSumMapper sysAdminSumMapper;

	@Override
	public List<SysAdminSumVo> findAll(Paging paging) throws Exception {
		RowBounds rwoBounds = new RowBounds(paging.getPageNumber(),paging.getPageSize());
		return sysAdminSumMapper.findAll(rwoBounds);
	}




	@Override
	public long findCount() {
		return sysAdminSumMapper.findCount();
	}

}
