package com.company;

import java.util.ArrayList;

public class dsa_combination {
        static void Comb_Sum(int ind,ArrayList<Integer> ds,int [] arr,int n,int target){
            if (ind==n){
                if(target==0){
                    System.out.println(ds);
                }
                else {
                    return;
                }
            }
            try {
                if (arr[ind]<=target){
                    ds.add(arr[ind]);
                    Comb_Sum(ind,ds,arr,n,target-arr[ind]);
                    ds.remove(arr[ind]);

                    //Comb_Sum(ind+1,ds,arr,n,target);
                }
                Comb_Sum(ind+1,ds,arr,n,target);

            }catch (Exception e){
                System.out.println();
            }



        }
        public static void main(String[] args) {
            int [] arr={2,3,6,7};
            int n= arr.length;
            int target=7;
            ArrayList<Integer> ds=new ArrayList<>();
            Comb_Sum(0,ds,arr,n,target);

        }
    }
