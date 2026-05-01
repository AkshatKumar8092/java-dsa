package org.Akshat.learnJavaWithMe.DSA_gfg_Patterns.SpecialPatterns;

import jdk.jshell.execution.Util;
import org.Akshat.learnJavaWithMe.utils.UtilsCommon;

public class PyramidV2 {

    public static void main(String[] args) {

        int n = UtilsCommon.takeIntIntput();

        int star = 1;
        int spaces = n-1;


        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=spaces;j++){
                System.out.print("  ");
            }
            spaces--;
            for(int j = 1; j<=star; j++){
                System.out.print("* ");
            }
            star+=2;
            System.out.println();
        }




    }
}
