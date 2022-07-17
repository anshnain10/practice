package com.company;

import java.util.Scanner;

public class dsa_fibonacii {
    static int fibo(int n){
        if (n==0|| n==1){
            return n;
        }
        else {
            return fibo(n-1)+fibo(n-2);

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println(fibo(a));

    }
}
