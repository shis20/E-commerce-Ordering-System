package com.imooc.dto;

import com.imooc.dataobject.OrderDetail;
import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Description: TODO
 * @author: Shuting Shi
 * @date: 2024年07月07日 4:05 a.m.
 */
@Data
public class OrderDTO {

    private String OrderId;

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;

    private String buyerOpenid;

    private BigDecimal orderAmount;

    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    private Date CreateTime;

    private Date updateTime;

    List<OrderDetail> orderDetailList;

}