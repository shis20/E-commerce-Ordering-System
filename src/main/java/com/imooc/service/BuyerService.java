package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * @Description: TODO
 * @author: Shuting Shi
 * @date: 2024年07月08日 4:21 a.m.
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openId, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openId, String orderId);
}
