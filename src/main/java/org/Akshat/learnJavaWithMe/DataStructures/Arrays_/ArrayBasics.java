package org.Akshat.learnJavaWithMe.DataStructures.Arrays_;

public class ArrayBasics {

    public static void main(String[] args) {


//        int x1 = 10, x2 = 20;
//        int x3 = 30;
//        int x4 = 40;
//        int x5 = 50;
//        int x6 = 60;
//        int x7 = 70;


        int[] arr = new int[10];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        arr[7] = 8;
        arr[8] = 9;
        arr[9] = 10;


        int[] arr1 = {10,20,30,40,50,60};

        // accessing the elements
        System.out.println("at index: "+0+" the value is "+arr1[0]);


        //updating value of the index = 0
        arr1[0] = 101;
        System.out.println("at index: "+0+" the value is "+arr1[0]);




        System.out.println("Below is for-loop");
//        indexing
        for(int i= 0; i<arr1.length; i++){
            System.out.println("at index: "+i+" the value is "+arr1[i]);
        }




    }
}
