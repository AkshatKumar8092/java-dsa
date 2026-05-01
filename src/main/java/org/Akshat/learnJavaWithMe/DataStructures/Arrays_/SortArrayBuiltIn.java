package org.Akshat.learnJavaWithMe.DataStructures.Arrays_;

import org.Akshat.learnJavaWithMe.utils.ArrayUtils;

import java.util.Arrays;

public class SortArrayBuiltIn {

    public static void main(String[] args) {

        // sort: either ascending or descending


        int[] arr = {10,321,143,65,765,745,523,4,-6,645};

        System.out.print("Before sorting ");
        ArrayUtils.printArr(arr);
        Arrays.sort(arr);
        System.out.print("After sorting ");
        ArrayUtils.printArr(arr);

    }
}
