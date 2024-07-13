package com.imooc.service;

import com.imooc.dataobject.SellerInfo;

/**
 * @Description: TODO
 * @author: Shuting Shi
 * @date: 2024年07月11日 10:20 p.m.
 */
public interface SellerService {

    SellerInfo findSellerInfoByOpenid(String openid);
}