package org.Akshat.learnJavaWithMe.sorting.bubbleSort;

import org.Akshat.learnJavaWithMe.utils.ArrayUtils;

public class BubbleSort {

    public static void sort(int[] arr){


        System.out.println("Array before sorting: ");
        ArrayUtils.printArr(arr);


        for(int i = 0; i< arr.length-1; i++){

            for(int j = 0; j<arr.length-1-i; j++){

                if(arr[j]>arr[j+1])
                    ArrayUtils.swap(arr, j, j+1);

            }

        }


        System.out.println("Array after sorting: ");
        ArrayUtils.printArr(arr);








    }
}
