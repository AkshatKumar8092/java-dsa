package org.Akshat.learnJavaWithMe.DSA_gfg_Patterns.GFG_Question;

import org.Akshat.learnJavaWithMe.utils.UtilsCommon;

public class Question4 {

    public static void main(String[] args) {


        int n = UtilsCommon.takeIntIntput();


        int ch = 65;

        for(int i = 1; i<=n; i++)
        {
            for (int j = 1; j <=i ; j++) {

                System.out.print((char)(ch));

            }
            ch++;
            System.out.println();
        }

    }
}
