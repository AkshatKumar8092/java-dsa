package org.Akshat.learnJavaWithMe.DSA_gfg_Patterns.GFG_Question;

import java.util.ArrayList;
import java.util.List;

public class Question3 {

    public static void main(String[] args) {
        String s = "GeeK";


        List<String> ans = new ArrayList<>();

        for(int i = 0; i<s.length(); i++){
        StringBuilder sb = new StringBuilder();
            for (int j = 0; j < s.length()-i; j++) {
                sb.append(s.charAt(j));

            }
            ans.add(sb.toString());
        }

        System.out.println(ans);


    }
}
