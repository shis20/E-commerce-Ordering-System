package com.imooc.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Description: TODO
 * @author: Shuting Shi
 * @date: 2024年07月11日 10:10 p.m.
 */

@Data
@Entity
public class SellerInfo {

    @Id
    private String sellerId;

    private String userName;

    private String password;

    private String openid;
}