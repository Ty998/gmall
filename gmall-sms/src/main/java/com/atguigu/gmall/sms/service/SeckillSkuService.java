package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.sms.entity.SeckillSkuEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author xb
 * @email 2278927344@qq.com
 * @date 2020-12-14 19:54:43
 */
public interface SeckillSkuService extends IService<SeckillSkuEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

