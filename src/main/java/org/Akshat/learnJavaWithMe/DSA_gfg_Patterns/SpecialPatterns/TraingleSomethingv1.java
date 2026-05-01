package org.Akshat.learnJavaWithMe.DSA_gfg_Patterns.SpecialPatterns;

import org.Akshat.learnJavaWithMe.utils.UtilsCommon;

public class TraingleSomethingv1 {

    public static void main(String[] args) {



        int n = UtilsCommon.takeIntIntput();


        for (int i = 1; i <=n ; i++) {

            for(int j = 1; j<=i-1;j++){
                System.out.print("  ");
            }
            for(int j = n-i+1; j>=1;j--){
                System.out.print(" *");
            }


            System.out.println();

        }
    }
}
