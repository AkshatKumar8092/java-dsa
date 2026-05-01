package org.Akshat.learnJavaWithMe.methods;

import org.Akshat.learnJavaWithMe.utils.UtilsCommon;

public class PurmatationAndCombination {
    public static long factorial(int num){
        long ans = 1;
        for(int i =1; i<=num;i++){
            ans *= i;
        }
        return ans;
    }

    public static double nCr(int n, int r){
        return factorial(n)/(factorial(r)*factorial(n-r));
    }

    public static double nPr(int n, int r){
        return factorial(n)/factorial(n-r);
    }

    public static void main(String[] args) {
        int n = UtilsCommon.takeIntIntput();
        int r = UtilsCommon.takeIntIntput();

        double d = nCr(n,r);
        System.out.println("answer for nCr is : "+d);
        double p = nPr(n,r);
        System.out.println("answer for nPr is : "+p);

    }
}
