package org.Akshat.learnJavaWithMe.methods.HomeWork;

public class GreatorNumberUsingBuiltInMethods {

    public static void main(String[] args) {



        int a = 10;
        int b = 20;
        int c = 30;


//
//        if(Math.max(a,b) == a && Math.max(a,c) == a){
//            System.out.println("A is greator");
//        }
//        else if(Math.max(a,b) == b && Math.max(b,c) == b){
//            System.out.println("B Is greator");
//        }
//        else{
//            System.out.println("C Is greator");
//        }


        System.out.println(Math.max(Math.max(a,b),c));
    }
}
