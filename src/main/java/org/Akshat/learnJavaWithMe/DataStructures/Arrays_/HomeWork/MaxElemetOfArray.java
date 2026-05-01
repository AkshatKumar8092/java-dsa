package org.Akshat.learnJavaWithMe.DataStructures.Arrays_.HomeWork;

import org.Akshat.learnJavaWithMe.utils.ArrayUtils;

public class MaxElemetOfArray {

    public static void main(String[] args) {


        int[] arr = ArrayUtils.takeInputForArr();
        ArrayUtils.printArr(arr);
        System.out.println("max element of the arr is: "+maxInArr(arr));


    }

    public static int maxInArr(int[] arr){
        int max = arr[0];

        for(int i =1; i<arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
