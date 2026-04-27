package org.Akshat.learnJavaWithMe.DSA_gfg_Patterns.Triangle;

import org.Akshat.learnJavaWithMe.utils.UtilsCommon;

public class AlphabetTriangle {


    public static void main(String[] args) {
        int n = UtilsCommon.takeIntIntput();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();

        }
    }
}
