package com.imooc.utils;

import com.imooc.enums.CodeEnum;

/**
 * @Description: TODO
 * @author: Shuting Shi
 * @date: 2024年07月09日 10:17 p.m.
 */
public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each : enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}