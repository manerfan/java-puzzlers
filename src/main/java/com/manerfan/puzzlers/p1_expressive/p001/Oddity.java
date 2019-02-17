package com.manerfan.puzzlers.p1_expressive.p001;

import java.util.stream.IntStream;

/**
 * Oddity
 *
 * @author Maner.Fan
 * @date 2019-02-15
 */
public class Oddity {
    /**
     * 判断i是否为奇数
     *
     * @param i 数字
     * @return true-false
     */
    public static boolean isOdd(int i) {
        return i % 2 == 1;
    }

    /**
     * 与0进行比较
     */
    public static boolean isOdd_v1(int i) {
        return i % 2 != 0;
    }

    /**
     * 使用位运算
     */
    public static boolean isOdd_v2(int i) {
        return (i & 1) != 0;
    }

    public static void main(String[] args) {
        System.out.println("===== isOdd");
        IntStream.rangeClosed(-3, 3).forEach(
            (i) -> System.out.println(String.format("isOdd(%d): %b", i, isOdd(i))));

        System.out.println("===== isOdd_v1");
        IntStream.rangeClosed(-3, 3).forEach(
            (i) -> System.out.println(String.format("isOdd_v1(%d): %b", i, isOdd_v1(i))));

        System.out.println("===== isOdd_v2");
        IntStream.rangeClosed(-3, 3).forEach(
            (i) -> System.out.println(String.format("isOdd_v2(%d): %b", i, isOdd_v2(i))));

        System.out.println("===== 奇数");
        System.out.println(" 5 %  2 = " + 5 % 2);
        System.out.println("-5 % -2 = " + -5 % -2);
        System.out.println("-5 %  2 = " + -5 % 2);
        System.out.println(" 5 % -2 = " + 5 % -2);

        System.out.println("===== 偶数");
        System.out.println(" 4 %  2 = " + 4 % 2);
        System.out.println("-4 % -2 = " + -4 % -2);
        System.out.println("-4 %  2 = " + -4 % 2);
        System.out.println(" 4 % -2 = " + 4 % -2);

        System.out.println("===== zero");
        System.out.println(" 0 %  2 = " + 0 % 2);
        System.out.println("-0 % -2 = " + -0 % -2);
        System.out.println("-0 %  2 = " + -0 % 2);
        System.out.println(" 0 % -2 = " + 0 % -2);
    }
}
