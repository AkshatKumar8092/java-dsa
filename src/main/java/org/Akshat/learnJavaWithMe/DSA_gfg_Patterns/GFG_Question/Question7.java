package org.Akshat.learnJavaWithMe.DSA_gfg_Patterns.GFG_Question;

import org.Akshat.learnJavaWithMe.utils.UtilsCommon;

public class Question7 {

    public static void main(String[] args) {



        int n = UtilsCommon.takeIntIntput();



        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i ; j++) {
                if (i == j || (i + j) % 2 == 0) {

                    System.out.print("1");
                }else
                    System.out.print("0");
            }
            System.out.println();

        }


    }
}
