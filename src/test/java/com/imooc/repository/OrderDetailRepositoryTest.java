package com.imooc.repository;

import com.imooc.dataobject.OrderDetail;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
public class OrderDetailRepositoryTest extends TestCase {

    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void saveTest() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("123456789");
        orderDetail.setOrderId("11111111");
        orderDetail.setProductIcon("http://xxx.jpg");
        orderDetail.setProductId("123456");
        orderDetail.setProductName("喵喵酱");
        orderDetail.setProductPrice(new BigDecimal(15.8));
        orderDetail.setProductQuantity(2);

        OrderDetail result = repository.save(orderDetail);
        Assert.assertNotNull(result);
    }

    public void findByOrderId() throws Exception {
        List<OrderDetail> orderDetailList = repository.findByOrderId("11111111");
        Assert.assertNotEquals(0, orderDetailList.size());
    }
}