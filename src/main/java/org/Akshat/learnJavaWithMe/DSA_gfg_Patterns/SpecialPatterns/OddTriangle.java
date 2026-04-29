package org.Akshat.learnJavaWithMe.DSA_gfg_Patterns.SpecialPatterns;

import org.Akshat.learnJavaWithMe.utils.UtilsCommon;

public class OddTriangle {


    public static void main(String[] args) {


        int n = UtilsCommon.takeIntIntput();


        for (int i = 1; i <= n; i++) {
            int a =1;
            for (int j = 1; j <= i; j++) {
                System.out.print((a)+" ");
                a+=2;
            }
            System.out.println();
        }
    }

}
