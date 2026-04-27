package org.Akshat.learnJavaWithMe.sorting.bubbleSort;

import org.Akshat.learnJavaWithMe.utils.arrUtils;

public class BubbleSort {

    public static void sort(int[] arr){


        System.out.println("Array before sorting: ");
        arrUtils.printArr(arr);


        for(int i = 0; i< arr.length-1; i++){

            for(int j = 0; j<arr.length-1-i; j++){

                if(arr[j]>arr[j+1])
                    arrUtils.swap(arr, j, j+1);

            }

        }


        System.out.println("Array after sorting: ");
        arrUtils.printArr(arr);








    }
}
