package org.Akshat.learnJavaWithMe.DSA_gfg_Patterns.GFG_Question;

import jdk.jshell.execution.Util;
import org.Akshat.learnJavaWithMe.utils.UtilsCommon;

public class Question2 {

    public static void main(String[] args) {

        int n = UtilsCommon.takeIntIntput();


        for(int i = 1; i<=n ; i++){
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");

            }
            System.out.print(" ");
        }



    }
}
