package org.Akshat.learnJavaWithMe.DSA_gfg_Patterns.SpecialPatterns;

import org.Akshat.learnJavaWithMe.utils.UtilsCommon;

public class FloydsTriangle {

    public static void main(String[] args) {



        int n = UtilsCommon.takeIntIntput();


        int cnt=  1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print((cnt++)+" ");

//                cnt++;

            }
            System.out.println();

        }



    }
}
