package org.Akshat.learnJavaWithMe.DataStructures.Arrays_.HomeWork;

import org.Akshat.learnJavaWithMe.utils.UtilsCommon;

public class NegativeInArr {

    public static void main(String[] args) {

        System.out.print("Enter the len of the array: ");
        int n = UtilsCommon.takeIntIntput();
        System.out.println();

        int[] arr = new int[n];
        System.out.println("array created");

        for(int i = 0; i<n;i++){
            System.out.print("Enter the number for index "+i+": ");
            arr[i] = UtilsCommon.takeIntIntput();

        }


        System.out.println();



        for(int i = 0; i<n;i++){
            if (arr[i]<0) System.out.println("At index= "+i+", negative value found & the value is "+arr[i]);

        }
        System.out.println();




    }
}
