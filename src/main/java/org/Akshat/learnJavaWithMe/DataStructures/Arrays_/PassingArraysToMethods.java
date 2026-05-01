package org.Akshat.learnJavaWithMe.DataStructures.Arrays_;

import org.Akshat.learnJavaWithMe.utils.ArrayUtils;

public class PassingArraysToMethods {

    private static void change(int x) {
        x = 20;
    }
    public static void main(String[] args) {
//        int  x = 10;
//        System.out.println("Before change() x = "+x);
//        change(x);
//        System.out.println("After change() x = "+x);
        int[] x = {10,20,30,40};

        System.out.print("Before: ");
        ArrayUtils.printArr(x);
        change(x);

        System.out.print("After: ");
        ArrayUtils.printArr(x);
    }

    private static void change(int[] p) {
        p[2] = 100;
    }

}
