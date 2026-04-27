package org.Akshat.learnJavaWithMe.DSA_gfg_Patterns.SquareAndRectange;

import org.Akshat.learnJavaWithMe.utils.UtilsCommon;

public class alphabetSmallSquare {

    public static void main(String[] args) {



        int n = UtilsCommon.takeIntIntput();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++){

                System.out.print((char)(j+96)+" ");

            }

            System.out.println();

        }

    }
}
