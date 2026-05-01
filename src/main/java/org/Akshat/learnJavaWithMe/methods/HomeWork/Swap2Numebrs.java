package org.Akshat.learnJavaWithMe.methods.HomeWork;

import org.Akshat.learnJavaWithMe.utils.UtilsCommon;

public class Swap2Numebrs {

    public static void main(String[] args) {
        int a = UtilsCommon.takeIntIntput();
        int b = UtilsCommon.takeIntIntput();
        System.out.println("In the main method before swapping: "+(a)+" "+(b));
        swap(a,b);
        System.out.println("In the main method after swapping: "+(a)+" "+(b));
    }

    public static void swap(int a, int b){
        System.out.println("before swapping: "+(a)+" "+(b));
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: "+(a)+" "+(b));
    }
}
