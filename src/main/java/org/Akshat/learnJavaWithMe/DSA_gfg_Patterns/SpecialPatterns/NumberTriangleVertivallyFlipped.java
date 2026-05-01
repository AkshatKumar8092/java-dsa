package org.Akshat.learnJavaWithMe.DSA_gfg_Patterns.SpecialPatterns;

import org.Akshat.learnJavaWithMe.utils.UtilsCommon;

public class NumberTriangleVertivallyFlipped {

    public static void main(String[] args) {


        int n = UtilsCommon.takeIntIntput();


        for(int i = 1; i<=n;i++){
            for(int j = 1; j<= n-i;j++){
                System.out.print("  ");
            }
            for (int j =1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
