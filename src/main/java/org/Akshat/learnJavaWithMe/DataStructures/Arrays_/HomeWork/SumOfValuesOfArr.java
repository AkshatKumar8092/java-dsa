package org.Akshat.learnJavaWithMe.DataStructures.Arrays_.HomeWork;

import org.Akshat.learnJavaWithMe.utils.UtilsCommon;

public class SumOfValuesOfArr {

    public static void main(String[] args) {

        System.out.print("Enter the len of arr: ");
        int arrLen = UtilsCommon.takeIntIntput();

        int[] arr = new int[arrLen];

        for(int i = 0; i<arrLen; i++){
            System.out.print("Enter a number: ");
            arr[i] = UtilsCommon.takeIntIntput();
        }

        System.out.print("Sum of all the elements of the arr is: ");
        int sum = 0;
        for(int i = 0; i<arrLen; i++){
            sum+=arr[i];
        }
        System.out.print(sum);
        System.out.println();

    }
}
