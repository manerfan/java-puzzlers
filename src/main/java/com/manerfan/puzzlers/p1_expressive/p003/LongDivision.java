package com.manerfan.puzzlers.p1_expressive.p003;

/**
 * LongDivision
 * <p>
 * 在处理大数（Large Numbers）时，需要留意数据溢出问题（overflow）
 *
 * @author Maner.Fan
 * @date 2019-02-17
 */
public class LongDivision {
    public static void main(String[] args) {
        final int MICROS_PER_DAY_INT = 24 * 60 * 60 * 1000 * 1000;
        final int MILLIS_PER_DAY_INT = 24 * 60 * 60 * 1000;
        System.out.println("MICROS_PER_DAY(int) / MILLIS_PER_DAY(int) = " + MICROS_PER_DAY_INT / MILLIS_PER_DAY_INT);

        final long MICROS_PER_DAY_LONG = 24L * 60 * 60 * 1000 * 1000;
        final long MILLIS_PER_DAY_LONG = 24L * 60 * 60 * 1000;
        System.out.println(
            "MICROS_PER_DAY(long) / MILLIS_PER_DAY(long) = " + MICROS_PER_DAY_LONG / MILLIS_PER_DAY_LONG);
    }
}
