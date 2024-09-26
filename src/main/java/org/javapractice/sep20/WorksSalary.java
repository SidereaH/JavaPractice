package org.javapractice.sep20;

import java.util.Arrays;
import java.util.Scanner;

public class WorksSalary {
    public static void main(String[] args) {
        System.out.println("First task, write 3 lengths");
        var in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (canLeave(a,b,c)){
            System.out.println("Существуе");
        }
        else{
            System.out.println("Не существуе");
        }
        System.out.println("Second task, write triangle");
        StringBuilder eight = new StringBuilder();
        for (int i =0; i < 10; i++){
            eight.append(8);
            System.out.println(eight);
        }
        System.out.println("Third task, priamougooooolnik");
        int i =0;
        int length = 0;
        while(i<=5){
            length++;
            System.out.print("Q");
            if (length>=10){
                length = 0;
                System.out.println();
                i++;
            }
        }
        System.out.println("Fourth task, write 3 numbers");
        int a1 = in.nextInt();
        int b1 = in.nextInt();
        int c1 = in.nextInt();
        if (a1 == b1){
            System.out.println(a1 + " " + b1);
        }
        else if (a1 == c1){
            System.out.println(a1 + " " + c1);
        }
        else if (a1 == b1 && a1 == c1){
            System.out.println(a1 + " " + b1 + " " + c1);
        }
        else if (b1 == c1){
            System.out.println(b1 + " " + c1);
        }
        System.out.println();
        int[] firstArray = {1,12,4,2,1};
        int[] secondArray = {12,3,2,1,1,1,1,1,0};
        int[] result = sumTwoArrays(firstArray, secondArray);
        System.out.println(Arrays.toString(result));
        int i1 = 0;
        int j1=0;
        StringBuilder inside = new StringBuilder();
        inside.append('Б');
        inside.append('Б');
        while(inside.length() <= 20){
            inside.insert(inside.length()-1, " ");
        }
        while(i1 <=10){
            while(j1 <= 20){
                if (j1 == 20){
                    System.out.print("Б\n");
                }
                else {
                    System.out.print("Б");
                }
                j1++;
            }
            if (i1 == 10){
                j1 = 0;
                while(j1 <= 20){
                    if (j1 == 20){
                        System.out.print("Б\n");
                    }
                    else {
                        System.out.print("Б");
                    }
                    j1++;
                }
            }
            else{
                System.out.println(inside);
            }
            i1++;
        }
    }
     static boolean canLeave(int a, int b, int c){
        if (a+b > c || a+c > b || b+c > b){
            return true;
        }
        else return false;

    }
    static int[] sumTwoArrays(int[] fArr, int[] sArr){
        int[] resultArr = new int[fArr.length + sArr.length];
        for (int i =0; i< fArr.length; i++){
            resultArr[i] = fArr[i];
        }
        for (int i = 0; i < sArr.length; i++){
            resultArr[i + fArr.length ] = sArr[i];
        }
        return resultArr;
    }
}
