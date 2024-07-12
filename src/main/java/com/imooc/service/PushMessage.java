package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * @Description: TODO
 * @author: Shuting Shi
 * @date: 2024年07月12日 8:22 a.m.
 */
public interface PushMessage {

    void orderStatus(OrderDTO orderDTO);
}
