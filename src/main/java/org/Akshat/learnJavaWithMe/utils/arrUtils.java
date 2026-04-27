package org.Akshat.learnJavaWithMe.utils;

public class arrUtils {

    public static void printArr(int[] arr){

        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
