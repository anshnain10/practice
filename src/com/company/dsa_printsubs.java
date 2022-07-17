package com.company;

import java.util.ArrayList;

public class dsa_printsubs {
    static void PrintSubs(int index,ArrayList<Integer> a,int [] arr,int n){

        if (index==n){
            for (int aa:a
                 ) {
                System.out.print(aa+" ");

            }
            if (a.size()==0){
                System.out.println("{}");

            }
            System.out.println("");

        }
        else {
            a.add(arr[index]);

            PrintSubs(index + 1, a, arr, n);
            a.remove(a.size()-1);
            PrintSubs(index + 1, a, arr, n);

        }

        return;

    }
    public static void main(String[] args) {
        int []arr={3,1,2};
        int n= arr.length;
        ArrayList<Integer> arrayList=new ArrayList<Integer>();

        PrintSubs(0,arrayList,arr,n);

    }
}
