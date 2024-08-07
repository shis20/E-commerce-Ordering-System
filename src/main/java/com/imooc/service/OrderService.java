package com.imooc.service;

import com.imooc.dataobject.OrderMaster;
import com.imooc.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @Description: TODO
 * @author: Shuting Shi
 * @date: 2024年07月07日 4:01 a.m.
 */
public interface OrderService {

    //创建订单
    OrderDTO create(OrderDTO orderDTO);

    // 查询订单
    OrderDTO findOne(String orderId);

    // 查询订单 列表
    Page<OrderDTO> findList(String buyerOpenid, Pageable pageable);

    // 取消订单
    OrderDTO cancel(OrderDTO orderDTO);

    // 完结订单
    OrderDTO finish(OrderDTO orderDTO);

    // 支付订单
    OrderDTO paid(OrderDTO orderDTO);

    Page<OrderDTO> findList(Pageable pageable);
}