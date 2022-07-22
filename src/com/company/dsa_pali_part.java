package com.company;

import java.util.ArrayList;
import java.util.List;

public class dsa_pali_part {
    public static void partition(String s){
        List<List<String>> res=new ArrayList<>();
        ArrayList<String> ds=new ArrayList<>();
        func( s,0, res,ds);
        System.out.println(res);
        //List<List<String>> instead of void for leetcode submission


    }
    static void func(String s,int index,List<List<String>> res,ArrayList<String> ds){
        if (index==s.length()){
            res.add(new ArrayList<>(ds));
            return;
        }
        for (int i=index;i<s.length();i++){
            if (isPalindrome(s,index,i)){
                ds.add(s.substring(index,i+1));
                func(s,i+1,res,ds);
                ds.remove(ds.size()-1);

            }

        }
    }

    static boolean isPalindrome(String s,int strt,int end) {
        while (strt<=end){
            if (s.charAt(strt++)!=s.charAt(end--)){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        String s="aabb";
        partition(s);




    }
}
