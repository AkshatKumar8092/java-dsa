package org.Akshat.learnJavaWithMe.DataStructures.Arrays_;

import org.Akshat.learnJavaWithMe.utils.UtilsCommon;

public class OutputAndInputArray {

    public static void main(String[] args) {

        int[] arrV1 = new int[10];
        int[] arrV2 = {1,2,4,134,32,5,-6,-97,431,41,341,41,4};

//        System.out.println(arrV2[0]);
//        System.out.println(arrV2[1]);
//        System.out.println(arrV2[2]);
//        System.out.println(arrV2[3]);
//        System.out.println(arrV2[4]);
//        System.out.println(arrV2[5]);
//        System.out.println(arrV2[6]);
//        System.out.println(arrV2[7]);


        System.out.println("arrV2.length of the arrV2 is "+arrV2.length);


        int n = arrV2.length;
        System.out.println("Using for loop");
        for(int i = 0;i<n; i++){
            System.out.print(arrV2[i]+ " ");
        }
        System.out.println();


        System.out.println("Using While loop");
        int i = 0;
        while(i<n){
            System.out.print(arrV2[i]+ " ");
            i++;
        }
        System.out.println();



        System.out.println("Taking input ");

        System.out.print("Enter the len of the arrayForInput: ");
        int lenArr = UtilsCommon.takeIntIntput();
        int [] arrInput = new int[lenArr];
        int lenArrInput = arrInput.length;
        for(int c = 0; c<lenArrInput; c++){
            System.out.print("Enter the number for index = "+c+": ");
//            int number = ;
            arrInput[c] = UtilsCommon.takeIntIntput();
        }

        for(int p = 0;p<lenArrInput; p++){
            System.out.print(arrInput[p]+ " ");
        }
        System.out.println();
        System.out.println("Printing the double of the input");
        for(int p = 0;p<lenArrInput; p++){
            System.out.print((arrInput[p]*2)+ " ");
        }
        System.out.println();


    }
}
