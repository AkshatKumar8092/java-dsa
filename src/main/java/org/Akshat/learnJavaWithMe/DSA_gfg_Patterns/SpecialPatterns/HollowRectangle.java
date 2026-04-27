package org.Akshat.learnJavaWithMe.DSA_gfg_Patterns.SpecialPatterns;

import org.Akshat.learnJavaWithMe.utils.UtilsCommon;

public class HollowRectangle {

    public static void main(String[] args) {

        int row = 5;
        int col = 7;
        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= col ; j++) {
                if(i == 1 || i==row){
                    System.out.print("* ");
                }
                else{
                    if(i>1 && i<row){
                        if(j == 1 || j == col){
                            System.out.print("* ");
                        }
                        else {
                            System.out.print("  ");
                        }
                    }
                }
            }
            System.out.println();
        }


        int row1 = UtilsCommon.takeIntIntput();
        int col1 = UtilsCommon.takeIntIntput();


        for(int i = 1; i<=row1; i++){
            for(int j = 1; j<=col1; j++){
                if(i == 1 || i == row1 || j == 1 || j == col1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }






    }
}
