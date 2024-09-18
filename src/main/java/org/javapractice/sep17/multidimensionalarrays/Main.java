package org.javapractice.sep17.multidimensionalarrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0; i< arr.length; i++){
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("Deep arrsd");
        int[][] arrsd = new int[5][];
        for(int i = 0; i< arrsd.length; i++){
            int length = (int) (Math.random() * 10 + 1);
            arrsd[i] = new int[length];
            for (int k = 0; k < arrsd[i].length; k++){
                arrsd[i][k] = (int) (Math.random() * 10 + 1);
            }
        }

        for(int i = 0; i< arrsd.length; i++){
            System.out.print("[");
            for (int k = 0; k < arrsd[i].length; k++){
                System.out.print(arrsd[i][k]);
                if (k !=  arr.length - 1 ){
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            System.out.println();
        }


//        for (int[] ints : arrsd) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println();
//        }


    }
}
