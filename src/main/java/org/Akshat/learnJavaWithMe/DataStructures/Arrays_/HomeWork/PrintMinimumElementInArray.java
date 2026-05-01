package org.Akshat.learnJavaWithMe.DataStructures.Arrays_.HomeWork;

import org.Akshat.learnJavaWithMe.utils.ArrayUtils;

public class PrintMinimumElementInArray {

    public static void main(String[] args) {


        int[] arr = ArrayUtils.takeInputForArr();

        int min = arr[0];

        for(int i = 0; i<arr.length; i++){
            min = Math.min(min, arr[i]);
        }
        System.out.println("Min element: "+min);


    }
}
