package org.Akshat.learnJavaWithMe.DataStructures.Arrays_;

import java.util.Arrays;

public class ShallowCopyDeepCopy {

//    public static void shallowCopy() {
//
//
//        int a = 4; // 4 bytes leta h ye
//
//
//        int[] arr = {10, 20 , 30 ,40}; // 16 bytes of continious memory allocation
//        int[] x = arr; // x is shallow copy of arr
//
//        x[0] = 100;
//        System.out.println(arr[0]); // arr will also change
//        // this change is know as shallow copy
//    }


    public static void main(String[] args) {



        int[] arr = {10,20,30,40, 50};
        int[] newArr = Arrays.copyOf(arr, arr.length);

        newArr[0] = 100;
        System.out.println(newArr[0]);
        System.out.println(arr[0]);



    }

}
