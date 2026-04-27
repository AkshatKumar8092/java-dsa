package org.Akshat.learnJavaWithMe.DSA_gfg_Patterns.SquareAndRectange;

import org.Akshat.learnJavaWithMe.utils.UtilsCommon;

public class AlphabetSquare {


    public static void main(String[] args) {

        int n = UtilsCommon.takeIntIntput();

        for(int i = 1; i<=n; i++){
            for(int j = 65; j<=64+n; j++){
                System.out.print((char)j+" ");
            }
            System.out.println();

        }

        System.out.println();


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char)(j+64)+ " ");

                
            }

            System.out.println();
            
        }

    }



}
