package com.manerfan.puzzlers.p1_expressive.p006;

/**
 * Multicast
 *
 * @author Maner.Fan
 * @date 2019-02-17
 */
public class Multicast {
    public static void main(String[] args) {
        System.out.println("                     (byte) -1 = " + (byte)-1);
        System.out.println("(int)                (byte) -1 = " + (int)(byte)-1);
        System.out.println("(int)         (char) (byte) -1 = " + (int)(char)(byte)-1);
        System.out.println("(int) (short)        (byte) -1 = " + (int)(short)(byte)-1);
        System.out.println("(int) (short) (char) (byte) -1 = " + (int)(short)(char)(byte)-1);

        System.out.println(Integer.toHexString(-1));
    }
}
