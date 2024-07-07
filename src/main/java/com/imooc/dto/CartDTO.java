package com.imooc.dto;

import lombok.Data;

/**
 * @Description: TODO
 * @author: Shuting Shi
 * @date: 2024年07月07日 5:46 a.m.
 */
@Data
public class CartDTO {
    private String productId;

    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}