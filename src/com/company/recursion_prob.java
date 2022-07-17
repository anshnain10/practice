package com.company;

import java.util.Scanner;



public class recursion_prob {
//    QUES 1
//    APPROACH 1
//    static int count=0;
//    public static void print(){
//        if (count==5){
//            return;
//        }
//        System.out.println("hello");
//        count++;
//        print();
//
//    }
//    APPROACH 2
//    static void print(int i,int n1){
//        if (i>n1){
//            return;
//        }
//        System.out.println("ANSH");
//        print(i+1,n1);
//        }


//    QUES 3
//    static void reverseno(int n1,int i){
//        if (n1<i){
//            return;
//        }
//        System.out.println(n1);
//        reverseno(n1-1,i);
//    }

//    ques4

//    static void backtrack_rev(int i,int n){
//        if (i>n){
//            return;
//        }
//        backtrack_rev(i+1,n);
//        System.out.println(i);
//    }
//    sum of n n o
//    static int recsum(int n){
//        if (n==0){
//        return 0; }
//        else {
//            return n+recsum(n-1);
//        }
//    }

//factorial
////
//    static int revarr(int i,int arr[],int n) {
//        int b ;
//        if (i >= n / 2) {
//            return -1;
//        } else {
//            b=arr[i];
//            arr[i]=arr[n-i-1];
//            arr[n-i-1]=b;
//
//
//            return revarr(i+1,arr,n);
//        }
//    }




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        //System.out.println(recsum(n));
        //backtrack_rev(1,n);
       // System.out.println(fact(n,1));
        //reverseno(5,1);
        //print(1,n);


//        int []arr=new int[n];
//        for (int i=0;i<n;i++){
//            arr[i]= sc.nextInt(); -------> rev array
//        }
//        revarr(0,arr,n);
//        for (int b:arr
//             ) {
//            System.out.println(b);
//

        }



}
