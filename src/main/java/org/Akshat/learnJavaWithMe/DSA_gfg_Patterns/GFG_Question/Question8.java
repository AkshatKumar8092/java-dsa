package org.Akshat.learnJavaWithMe.DSA_gfg_Patterns.GFG_Question;

import org.Akshat.learnJavaWithMe.utils.UtilsCommon;

import java.util.ArrayList;

public class Question8 {

    public static void main(String[] args) {


        int n = UtilsCommon.takeIntIntput();

        ArrayList<String> ans = new ArrayList<>();

        for(int i = 1; i<=n; i++){
            StringBuilder a = new StringBuilder();
            for(int j = 1; j<= i;j++){
                a.append(j);
//                System.out.print(j);
            }
            for(int j = i-1; j>=1; j--){
                a.append(j);
//                System.out.print(j);
            }
            ans.add(a.toString());
//            System.out.print(" ");
        }
        System.out.println(ans);


    }
}
