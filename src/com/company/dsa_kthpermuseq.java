package com.company;

import java.util.ArrayList;

public class dsa_kthpermuseq {
    public static void permut(int n,int k){
        int fact=1;
        ArrayList<Integer> ds=new ArrayList<>();
        for (int i=1;i<n;i++){
            fact=fact*i;
            ds.add(i);
        }
        ds.add(n);
        String ans="";
        k=k-1;
        while (true){
            ans=ans+ds.get((k/fact));
            ds.remove(k/fact);
            if (ds.size()==0){
                break;
            }
            k=k%fact;
            fact=fact/ds.size();

        }
       // return ans;
        System.out.println(ans);
    }
    public static void main(String[] args) {
        permut(4,17);

    }
}
