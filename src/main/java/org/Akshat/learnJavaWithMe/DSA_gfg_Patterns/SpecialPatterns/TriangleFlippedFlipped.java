package org.Akshat.learnJavaWithMe.DSA_gfg_Patterns.SpecialPatterns;

import org.Akshat.learnJavaWithMe.utils.UtilsCommon;

public class TriangleFlippedFlipped {

    public static void main(String[] args) {



        int n = UtilsCommon.takeIntIntput();


        for(int i = 1;i<=n;i++){
            for(int j = 1; j<=n;j++){
                if(i+j < n+1) System.out.print("  ");
                else System.out.print("* ");
            }
            System.out.println();
        }
    }
}
