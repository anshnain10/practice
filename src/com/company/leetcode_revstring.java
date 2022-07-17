package com.company;

import java.util.Scanner;

public class leetcode_revstring {


        static void revStr(int i, String []s,int n){
            String b;
            if (i>=n/2){
                return;

            }
            else {
                b=s[i];
                s[i]=s[n-i-1];
                s[n-i-1]=b;

                revStr(i+1, s,n);
            }


        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            String []s=new String[n];
            for (int i=0;i<n;i++){
                s[i]= sc.next();
            }
            revStr(0,s,n);
            for (String b:s){
                System.out.println(b);
            }

            }

        }

