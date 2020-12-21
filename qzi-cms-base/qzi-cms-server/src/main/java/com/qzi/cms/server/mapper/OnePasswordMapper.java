/* 
 * 文件名：UseResidentMapper.java  
 * 版权：Copyright 2016-2017 炎宝网络科技  All Rights Reserved by
 * 修改人：邱深友  
 * 创建时间：2017年7月18日
 * 版本号：v1.0
*/
package com.qzi.cms.server.mapper;

import com.qzi.cms.common.po.OnePassWordPo;
import com.qzi.cms.common.po.UseCommunityPo;
import com.qzi.cms.common.po.UseResidentPo;
import com.qzi.cms.common.vo.*;
import com.qzi.cms.server.base.BaseMapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 一次性密码DAO
 * @author qsy
 * @version v1.0
 * @date 2020年7月9日
 */
public interface OnePasswordMapper extends BaseMapper<OnePassWordPo>{




    @Select("SELECT  * from use_resident_onePassword where equipmentNo=#{equipmentNo} and  communityId=#{communityId} and unitId=#{unitId} and roomNumber=${roomNumber} and onePassword=#{onePassword} and state='10'  limit 1")
    public OnePassWordPo  findPassword(@Param("equipmentNo") String  equipmentNo,@Param("communityId") String  communityId,@Param("unitId") String  unitId,@Param("roomNumber") String  roomNumber,@Param("onePassword") String  onePassword);



    @Select("select ro.*,ue.equipmentName from use_resident_onePassword ro left join use_equipment ue  on ro.equipmentId = ue.id where ro.residentId=#{residentId} order by ro.createTime desc")
    public List<OnePassWordVo> findPasswordResidentId(@Param("residentId") String  residentId);

}
