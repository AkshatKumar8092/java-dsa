package org.Akshat.learnJavaWithMe.DataStructures.Arrays_.HomeWork;

import org.Akshat.learnJavaWithMe.utils.ArrayUtils;
import org.Akshat.learnJavaWithMe.utils.UtilsCommon;

public class Mul2IfOddIndexElseAdd10ForEvenIndex {

    public static void main(String[] args) {

        int[] arr = ArrayUtils.takeInputForArr();

        System.out.print("Before: ");
        ArrayUtils.printArr(arr);

        for(int i = 0; i<arr.length;i++){
            if(i%2!=0){
                arr[i] *= 2;
            }else{
                arr[i] += 10;
            }
        }
        System.out.print("After: ");
        ArrayUtils.printArr(arr);





    }
}
