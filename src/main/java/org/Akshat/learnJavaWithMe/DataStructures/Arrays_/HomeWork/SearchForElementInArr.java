package org.Akshat.learnJavaWithMe.DataStructures.Arrays_.HomeWork;

import org.Akshat.learnJavaWithMe.utils.ArrayUtils;
import org.Akshat.learnJavaWithMe.utils.UtilsCommon;

public class SearchForElementInArr {

    public static void main(String[] args) {
        int [] arr = ArrayUtils.takeInputForArr();

        System.out.println("Enter the element you want to search");
        int searchElement = UtilsCommon.takeIntIntput();


        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == searchElement){
                System.out.println("Element found at index: "+i);
                found = true;
            }
        }
        if(!found){
            System.out.print(searchElement + " not found in ");
            ArrayUtils.printArr(arr);
        }

    }
}
