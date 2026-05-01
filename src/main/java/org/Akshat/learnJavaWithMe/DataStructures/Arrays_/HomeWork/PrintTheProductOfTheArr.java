package org.Akshat.learnJavaWithMe.DataStructures.Arrays_.HomeWork;

import org.Akshat.learnJavaWithMe.utils.ArrayUtils;

public class PrintTheProductOfTheArr {

    public static void main(String[] args) {

        int[] arr = ArrayUtils.takeInputForArr();

        long ans = findProduct(arr);
        System.out.print("Product of arr: ");
        ArrayUtils.printArr(arr);
        System.out.print(" is "+ans);


    }

    public static long findProduct(int[] arr){
        long productOfElements = 1;
        for(int i = 0; i<arr.length; i++){
            productOfElements*=arr[i];
        }
        return productOfElements;
    }
}
