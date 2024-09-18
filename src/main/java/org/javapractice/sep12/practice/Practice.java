package org.javapractice.sep12.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        System.out.println("FirstTask");

        int[] arr = new int[4];
        var in = new Scanner(System.in);
        int itr=0;
        while (in.hasNextLine()) {
            if (itr <4) {
                arr[itr] = in.nextInt();
                itr++;
            }
            else {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
        int min = (int) Double.POSITIVE_INFINITY;
        for(int i : arr){
            if (min > i){
                min = i;
            }
        }
//        if (min > a){
//            min = a;
//        }
//        if (min > b){
//            min = b;
//        }
//        if (min > c){
//            min = c;
//        }
//        if (min > d){
//            min = d;
//        }
        System.out.println(min);
        System.out.println("second task");
        int max = (int) Double.NEGATIVE_INFINITY;
        for(int i : arr){
            if (max < i){
                max = i;
            }
        }
        System.out.println();
        int count = 0;
        for (int i : arr){
            if (max == i){
                count++;
            }
        }
        System.out.println(count);
        System.out.println("third task");
        System.out.println("введите пять чисеел");
        int[] arr2 = new int[5];
        System.out.println(Arrays.toString(arr2));
        int itr2=0;
        while (in.hasNextLine()) {
            if (itr2 < 5){
                arr2[itr2] = in.nextInt();
                itr2++;
            }
            else{
                break;
            }

        }
        System.out.println(Arrays.toString(arr2));
        min = (int) Double.POSITIVE_INFINITY;
        for(int i : arr2){
            if (min > i){
                min = i;
            }
        }
        max = (int) Double.NEGATIVE_INFINITY;
        for(int i : arr2){
            if (max < i){
                max = i;
            }
        }
        System.out.println("min: " + min + "\n" + "max: " + max  + "\n");
        System.out.println("fourth task, write 2 names");

        var stringin = new Scanner(System.in);
        String name1, name2;

        name1 = stringin.nextLine();
        name2 = stringin.nextLine();

        if (name1.equalsIgnoreCase(name2)){
            System.out.println("тески \n");
        }
        else{
            System.out.println(name1);
            System.out.println(name2);
            System.out.println("не тезкии");
        }
        System.out.println("5 task");
        int day = 0;
        if (in.hasNextLine()){
            day = in.nextInt();
        }
        if (day <365 && day>= 334){
            System.out.println("зима");
        }
        else if(day < 334 && day >=242){
            System.out.println("осень");
        }
        else if (day<242 && day >= 152) {
            System.out.println("летоо");
        }
        else if (day<152 && day>=62) {
            System.out.println("весна");
        } else if (day<62 && day>=0){
            System.out.println("зимаа");
        }
        else {
            System.out.println("чето не то ввел бро");
        }
    }

}
