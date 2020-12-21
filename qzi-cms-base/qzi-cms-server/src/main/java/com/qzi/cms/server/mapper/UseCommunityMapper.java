/* 
 * 文件名：UseCommunityMapper.java  
 * 版权：Copyright 2016-2017 炎宝网络科技  All Rights Reserved by
 * 修改人：邱深友  
 * 创建时间：2017年6月27日
 * 版本号：v1.0
*/
package com.qzi.cms.server.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

import com.qzi.cms.common.po.UseCommunityPo;
import com.qzi.cms.common.vo.OptionVo;
import com.qzi.cms.common.vo.TreeVo;
import com.qzi.cms.common.vo.UseCommunityVo;
import com.qzi.cms.server.base.BaseMapper;

/**
 * 住宅小区DAO接口
 * @author qsy
 * @version v1.0
 * @date 2017年6月27日
 */
public interface UseCommunityMapper extends BaseMapper<UseCommunityPo>{

	/**
	 * @param rwoBounds
	 * @return
	 */
	public List<UseCommunityVo> findAll(@Param("userId") String  userId,RowBounds rwoBounds,@Param("criteria") String criteria);

	/**
	 * 查询用户
	 */
	@Select("select * from use_community where id = #{id}")
	public UseCommunityPo findOne(@Param("id") String id);

	@Select("select * from use_community where state='10'")
	public List<UseCommunityPo> findList();

	/**
	 * @return
	 */
	public long findCount(@Param("userId") String  userId,@Param("criteria") String criteria);


	/**
	 * @return
	 */
	@Select("select max(communityNo) from use_community")
	public String findMaxCommunityNo();

	/**
	 * @param id
	 * @return
	 */
	@Select("SELECT uc.id id,uc.communityName value from use_community uc,use_community_user ucu where uc.id = ucu.communityId and ucu.userId=#{userId} and uc.state='10'")
	public List<TreeVo> findTree(@Param("userId") String id);

	/**
	 * @param id
	 * @return
	 */
	@Select("SELECT uc.id value,uc.communityName name from use_community uc,use_community_user ucu where uc.id = ucu.communityId and ucu.userId=#{userId} and uc.state='10'")
	public List<OptionVo> findAllByUserId(@Param("userId") String id);

	public List<UseCommunityPo> regfindAll(@Param("model") UseCommunityPo po);
	public Integer regfindCount(@Param("model") UseCommunityPo po);

	@Select("SELECT uc.* from use_community uc  where uc.sysUserId=#{userId} and uc.state='10' limit 1")
	public UseCommunityVo  findUser(@Param("userId") String  userId);


	/**
	 * 微信获取小区数据
	 */

	@Select("select id,communityName,state from use_community")
	public  List<UseCommunityPo> wxFindAll();

	@Select("select * from use_community where communityNo = #{communityNo} limit 1")
	public UseCommunityVo  findCommunityNo(@Param("communityNo") String  communityNo);


	@Update("update use_community set state= #{state} where id=#{id}")
	public void updateDelete(@Param("state") String  state,@Param("id") String  id);

	@Update("update sys_user set state= #{state} where id=#{id}")
	public void updateUser(@Param("state") String  state,@Param("id") String  id);

	@Update("update use_equipment set state= #{state} where communityId=#{id}")
	public void updateEquipment(@Param("state") String  state,@Param("id") String  id);

	@Update("update use_resident set state= #{state} where communityId=#{id}")
	public void updateResident(@Param("state") String  state,@Param("id") String  id);

}
