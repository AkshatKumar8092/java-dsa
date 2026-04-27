package org.Akshat.learnJavaWithMe.DSA_gfg_Patterns.Triangle;

import org.Akshat.learnJavaWithMe.utils.UtilsCommon;

public class StarTriangleHorizontallyFlipped {

    public static void main(String[] args) {
        int n = UtilsCommon.takeIntIntput();

        for (int i = 1; i <= n; i++) {
            for(int j = n-i ; j >= 1 ; j--){
                System.out.print("* ");
            }
            System.out.println();

        }


        System.out.println();



        for (int i = 1; i <= n; i++) {
            for(int j = 1 ; j <= n+1-i ; j++){
                System.out.print("* ");
            }
            System.out.println();

        }

        System.out.println();

        for (int i = 1; i <= n; i++) {
            for(int j = n ; j >= i ; j--){
                System.out.print("* "+j);
            }
            System.out.println();

        }





        int n1 = UtilsCommon.takeIntIntput();
        int a = n1; // no of starts to be printed in each line


        for (int i = 1; i <= n1; i++) {
            for(int  j = 1; j<=a; j++){
                System.out.print("* ");
            }
            a--;
            System.out.println();


        }

    }
}
