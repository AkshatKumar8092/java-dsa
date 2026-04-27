package org.Akshat.learnJavaWithMe.DSA_gfg_Patterns.Triangle;

import org.Akshat.learnJavaWithMe.utils.UtilsCommon;

public class AlphaNumericTriangle {

    public static void main(String[] args) {
        int n= UtilsCommon.takeIntIntput();


        for(int i =1; i<=n;i++){
            for (int j = 1; j < i; j++) {
                if(i%2!=0){
                    System.out.print(j+" ");
                }
                else{
                    System.out.print((char)(j+64)+" ");
                }

            }
            System.out.println();

        }

    }
}
