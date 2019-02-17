package com.manerfan.puzzlers.p1_expressive.p002;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * TimeForChange
 *
 * @author Maner.Fan
 * @date 2019-02-17
 */
public class TimeForChange {

    /**
     * 两个double值相减
     *
     * @param x double
     * @param y double
     * @return double
     */
    private static double subtract(double x, double y) {
        return x - y;
    }

    /**
     * 使用double构造BigDecimal进行运算
     */
    private static BigDecimal subtract_v1(double x, double y) {
        return new BigDecimal(x).subtract(new BigDecimal(y));
    }

    /**
     * 深入理解BigDecimal，使用str构造BigDecimal进行运算
     */
    private static BigDecimal subtract_v2(double x, double y) {
        return new BigDecimal(Objects.toString(x)).subtract(new BigDecimal(Objects.toString(y)));
    }

    public static void main(String[] args) {
        System.out.println("subtract     2.0 - 1.1 = " + subtract(2.0d, 1.1d));
        System.out.println("subtract_v1  2.0 - 1.1 = " + subtract_v1(2.0d, 1.1d));
        System.out.println("subtract_v2  2.0 - 1.1 = " + subtract_v2(2.0d, 1.1d));
    }
}
