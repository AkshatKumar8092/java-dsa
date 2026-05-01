package org.Akshat.learnJavaWithMe.DSA_gfg_Patterns.SpecialPatterns;

import org.Akshat.learnJavaWithMe.utils.UtilsCommon;

public class DimondV1 {

    public static void main(String[] args) {

        int n = UtilsCommon.takeIntIntput();

        for(int i = 1; i<=n+n-1;i++) {

            if(i<=n){
                for (int j = 1; j < n - i + 1; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
//                for(int j = 1; j<=n-1; j++){
//                    System.out.println("  ");
//                }
//                for(int i )

//                for (int j =n-i; j >=1 ; j--) {
//                    System.out.print("  ");
//
//                }
//                for (int j = 2*i-1; j >=1 ; j--) {
//                    System.out.print("* ");
//
//                }
//                System.out.println();


                int x = 2 * n - i;

                for (int j = 1; j <= n - x; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= 2 * x - 1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

    }
}
