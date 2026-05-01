package org.Akshat.learnJavaWithMe.utils;

public class ArrayUtils {

    public static void printArr(int[] arr){

        System.out.print("[");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.print("]");
        System.out.println();
    }
    public static void printArr(String[] arr){

        System.out.print("[");
        for (String i : arr) {
            System.out.print(i+" ");
        }
        System.out.print("]");
        System.out.println();
    }
    public static void printArr(double[] arr){

        System.out.print("[");
        for (double i : arr) {
            System.out.print(i+" ");
        }
        System.out.print("]");
        System.out.println();
    }
    public static void printArr(long[] arr){

        System.out.print("[");
        for (long i : arr) {
            System.out.print(i+" ");
        }
        System.out.print("]");
        System.out.println();
    }
    public static void printArr(char[] arr){

        System.out.print("[");
        for (char i : arr) {
            System.out.print(i+" ");
        }
        System.out.print("]");
        System.out.println();
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static int[] takeInputForArr(){

        System.out.print("Enter the len of arr: ");
        int len = UtilsCommon.takeIntIntput();
        int[] arr = new int[len];
        for(int i = 0;i<len; i++){
            arr[i] = UtilsCommon.takeIntIntput();
        }
        return arr;
    }
}
