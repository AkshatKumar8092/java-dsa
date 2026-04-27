package org.Akshat.learnJavaWithMe.DSA_gfg_Patterns.SquareAndRectange;

import org.Akshat.learnJavaWithMe.utils.UtilsCommon;

public class AlphaBetSquare4 {

    public static void main(String[] args) {

        int n = UtilsCommon.takeIntIntput();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if ((i % 2) == 0) {
                    System.out.print((char) (i + 96) + " ");
                } else {
                    System.out.print((char) (i + 64) + " ");
                }

            }


            System.out.println();
        }


    }
}
