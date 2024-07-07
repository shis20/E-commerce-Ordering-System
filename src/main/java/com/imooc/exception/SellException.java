package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * @Description: TODO
 * @author: Shuting Shi
 * @date: 2024年07月07日 4:23 a.m.
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }
}