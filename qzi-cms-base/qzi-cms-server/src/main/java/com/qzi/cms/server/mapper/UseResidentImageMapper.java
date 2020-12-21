/* 
 * 文件名：UseResidentMapper.java  
 * 版权：Copyright 2016-2017 炎宝网络科技  All Rights Reserved by
 * 修改人：邱深友  
 * 创建时间：2017年7月18日
 * 版本号：v1.0
*/
package com.qzi.cms.server.mapper;

import com.qzi.cms.common.po.OnePassWordPo;
import com.qzi.cms.common.po.UseResidentEquipmentPo;
import com.qzi.cms.common.po.UseResidentImagePo;
import com.qzi.cms.common.po.UseResidentPo;
import com.qzi.cms.common.vo.UseResidentImageVo;
import com.qzi.cms.server.base.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * 人脸头像DAO
 * @author qsy
 * @version v1.0findImage
 * @date 2020年7月9日
 */
public interface UseResidentImageMapper extends BaseMapper<UseResidentImagePo>{

    //@Select("select * from use_resident_image where residentId in (select residentId from use_resident_equipment where equipmentId=#{equipmentId})  and unix_timestamp(createTime)*1000>#{timestrap}")
    public List<UseResidentImageVo> findImage(@Param("equipmentId") String equipmentId, @Param("communityNo") String communityNo, @Param("state") String state, @Param("timestrap") String timestrap);


    @Update("update use_resident_image set state=#{state},zipUrl=#{zipUrl} where phone=#{phone}")
    public void updateState(@Param("state") String state,@Param("zipUrl") String zipUrl,@Param("phone") String phone);



    @Update("update use_resident_image set state=#{state},imageUrl=#{imageUrl} where phone=#{phone}")
    public void updateStateState(@Param("state") String state,@Param("imageUrl") String imageUrl,@Param("phone") String phone);


    @Select("select * from  use_resident_image where phone=#{phone} limit 1")
    public UseResidentImagePo findOne(@Param("phone") String phone);


}
