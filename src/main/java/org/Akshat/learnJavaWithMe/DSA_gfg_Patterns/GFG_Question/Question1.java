package org.Akshat.learnJavaWithMe.DSA_gfg_Patterns.GFG_Question;

import org.Akshat.learnJavaWithMe.utils.UtilsCommon;

public class Question1 {


    public static void main(String[] args) {

        int n = UtilsCommon.takeIntIntput();

        for(int i = 1;i<=n;i++){
            for(int j = 1; j<=n+1-i;j++){

                System.out.print(j+" ");
            }
            System.out.println();
        }


    }
}
