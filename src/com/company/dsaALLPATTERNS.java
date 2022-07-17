package com.company;

import java.util.ArrayList;

public class dsaALLPATTERNS {

//print only one subsequence
    static boolean PrintSubsSum2(int index, ArrayList<Integer> a, int[] arr, int n, int s, int sum) {

        if (index == n) {
            if (s == sum) {
                for (int aa : a
                ) {
                    System.out.print(aa + " ");


                }

                System.out.println("");
                return true;


            }
            else {return false;}
        } else {
            a.add(arr[index]);
            s += arr[index];
            if (PrintSubsSum2(index + 1, a, arr, n, s, sum) == true) {
                return true;
            }
            s -= arr[index];
            a.remove(a.size() - 1);
            if (PrintSubsSum2(index + 1, a, arr, n, s, sum) == true) {
                return true;
            }
            return false;

        }


    }



    public static void main(String[] args) {
        int[] arr1 = {1, 2, 1};
        int n1 = arr1.length;
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        PrintSubsSum2(0, arrayList1, arr1, n1, 0, 3);


    }
}
//static void PrintSubsSum2(int index, ArrayList<Integer> a, int[] arr, int n, int s, int sum) {
//
//        if (index == n) {
//            if (s == sum) {
//                for (int aa : a
//                ) {
//                    System.out.print(aa + " ");
//
//                }
//
//                System.out.println("");
//            }
//        }
//
//
//        else {
//                a.add(arr[index]);
//                s+=arr[index];
//                PrintSubsSum2(index + 1, a, arr, n, s, sum);
//                s-=arr[index];
//                a.remove(a.size() - 1);
//                PrintSubsSum2(index + 1, a, arr, n, s, sum);
//
//            }
//
//            return;
//
//        }
//
//
//
//    public static void main(String[] args) {
//        int[] arr1 = {1, 2, 1};
//        int n1 = arr1.length;
//        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
//        PrintSubsSum2(0, arrayList1, arr1, n1, 0, 3);
//
//
//    }
//}



