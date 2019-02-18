package com.geekq.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.geekq.api.entity.GoodsVo;
import com.geekq.api.service.GoodsService;
import com.geekq.provider.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author 邱润泽
 */
@Service(version = "${demo.service.version}")
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    GoodsMapper goodsMapper;

    @Override
    public List<GoodsVo> listGoodsVo() {

        List<GoodsVo> goodsVos = null;
        try {
            goodsVos = goodsMapper.listGoodsVo();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return  goodsVos;
    }
}
