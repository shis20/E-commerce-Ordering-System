package com.imooc.utils;

import java.util.Random;

/**
 * @Description: TODO
 * @author: Shuting Shi
 * @date: 2024年07月07日 4:59 a.m.
 */
public class KeyUtil {

    //生成唯一主键
    //格式： 时间+ 随机数
    public static synchronized String genUniqueKey() {
        Random random = new Random();

        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }

}