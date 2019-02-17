package com.manerfan.puzzlers.p1_expressive.p005;

/**
 * JoyOfHex
 *
 * @author Maner.Fan
 * @date 2019-02-17
 */
public class JoyOfHex {
    public static void main(String[] args) {
        System.out.println("0x100000000L + 0xcafebabe  = 0x" + Long.toHexString(0x100000000L + 0xcafebabe));
        System.out.println("0x100000000L + 0xcafebabeL = 0x" + Long.toHexString(0x100000000L + 0xcafebabeL));

        System.out.println("0xcafebabe  = " + 0xcafebabe);
        System.out.println("0xcafebabeL = " + 0xcafebabeL);
    }
}
