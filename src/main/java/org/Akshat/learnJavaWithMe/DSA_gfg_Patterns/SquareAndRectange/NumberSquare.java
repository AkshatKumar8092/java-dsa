package org.Akshat.learnJavaWithMe.DSA_gfg_Patterns.SquareAndRectange;

import org.Akshat.learnJavaWithMe.utils.UtilsCommon;

public class NumberSquare {


    public static void main(String[] args) {


        int n = UtilsCommon.takeIntIntput();

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n ; j++){
                System.out.print(j+" ");

            }
            System.out.println();
        }

        System.out.println();


        for (int k = 0; k < 100; k++) {

            for (int i = 0; i < 100; i++) {

                System.out.print(i + " ");

            }

            System.out.println();
        }
    }
}
