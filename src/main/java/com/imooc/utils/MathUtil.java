package com.imooc.utils;

/**
 * @Description: TODO
 * @author: Shuting Shi
 * @date: 2024年07月09日 7:26 a.m.
 */
public class MathUtil {
    private static final Double MONEY_RANGE = 0.01;

    public static Boolean equals(Double d1, Double d2) {
        Double result = Math.abs(d1 - d2);
        if (result < MONEY_RANGE) {
            return true;
        } else {
            return false;
        }
    }
}