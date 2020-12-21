/* 
 * 文件名：SysParameterMapper.java  
 * 版权：Copyright 2016-2017 炎宝网络科技  All Rights Reserved by
 * 修改人：邱深友  
 * 创建时间：2017年6月15日
 * 版本号：v1.0
*/
package com.qzi.cms.server.mapper;

import com.qzi.cms.common.po.SysParameterPo;
import com.qzi.cms.common.vo.SysAdminSumVo;
import com.qzi.cms.common.vo.SysParameterVo;
import com.qzi.cms.server.base.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 参数设置DAO
 * @author qsy
 * @version v1.0
 * @date 2017年6月15日
 */
public interface SysAdminSumMapper extends BaseMapper<SysAdminSumVo>{

	/**
	 * @param rwoBounds
	 * @return
	 */
	@Select("select t1.communityId,t1.totalcount,t2.sumcount,uc.communityName,uc.communityNo from (select count(1) as totalcount,communityId from use_equipment ue inner JOIN use_equipment_port up on up.equipmentId = ue.id where  up.ips!='0.0.0.0' GROUP BY communityId) t1 inner join (select count(1) as sumcount,communityId from use_equipment GROUP BY communityId) t2  on t1.communityId = t2.communityId left join use_community uc on uc.id = t1.communityId ")
	public List<SysAdminSumVo> findAll(RowBounds rwoBounds);


	/**
	 * @return
	 */
	@Select("select count(1) from (select count(1) as totalcount,communityId from use_equipment ue inner JOIN use_equipment_port up on up.equipmentId = ue.id where  up.ips!='0.0.0.0' GROUP BY communityId) t1 inner join (select count(1) as sumcount,communityId from use_equipment GROUP BY communityId) t2  on t1.communityId = t2.communityId left join use_community uc on uc.id = t1.communityId")
	public long findCount();



}
