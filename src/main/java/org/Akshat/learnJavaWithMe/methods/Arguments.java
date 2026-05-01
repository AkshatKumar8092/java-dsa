package org.Akshat.learnJavaWithMe.methods;

public class Arguments {


    public static void sum(int a , int b){
        System.out.println("Sum of a and b is: "+(a+b));
    }


    public static void main(String[] args) {
//        sum(10,20);
        findMaxOf3Numbers(110,20,44);
    }

    public static void findMaxOf3Numbers(int a, int b, int c){
        int maxA_B = Math.max(a,b);
        System.out.println("Max numebr is: "+Math.max(maxA_B, c));
    }
}
