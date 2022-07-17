package com.company;

public class dsa_palindrome {


    static boolean pal(int i,String  s,int n){
        if (i>=n/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(n-i-1)){
            return false;
        }
        else {
            return pal(i+1,s,n);
        }

    }
    public static void main(String[] args) {
        String s="naman";

        int n=s.length();
        System.out.println(pal(0,s, n));

    }
}
