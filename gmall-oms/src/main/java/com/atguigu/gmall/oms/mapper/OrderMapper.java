package com.atguigu.gmall.oms.mapper;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xb
 * @email 2278927344@qq.com
 * @date 2020-12-14 19:45:31
 */
@Mapper
public interface OrderMapper extends BaseMapper<OrderEntity> {
	
}
