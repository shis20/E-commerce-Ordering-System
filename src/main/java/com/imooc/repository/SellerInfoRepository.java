package com.imooc.repository;

import com.imooc.dataobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description: TODO
 * @author: Shuting Shi
 * @date: 2024年07月11日 10:12 p.m.
 */
public interface SellerInfoRepository extends JpaRepository<SellerInfo, String> {

    SellerInfo findByOpenId(String openid);
}
