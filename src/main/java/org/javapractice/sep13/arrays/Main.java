package org.javapractice.sep13.arrays;

import org.javapractice.sep10.Cat;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] birthday = new String[10];
        String easy = RandomString.digits + "ACEFGHJKLMNPQRUVWXYabcdefhijkprstuvwx";
        RandomString tickets = new RandomString(23, new SecureRandom(), easy);
        for (int i = 0; i < birthday.length; i++) {
            birthday[i] = String.format(" %s : 1%d/12/200%d", tickets.nextString(), i, i);
        }
        System.out.println(
                Arrays.toString(birthday)
        );
        var cat = new Cat("Oleg", 78);
        Cat[] cats = new Cat[10];
        String[] namesforcat = new String[]{"Олег", "Никита", "Барсик", "Марсель"};
//        Random randstr = new Random(0, 3);
        Random age = new Random(20);
        for (int i = 0; i < cats.length; i++) {
//            int r = randstr.nextInt();
            cats[i] = new Cat(namesforcat[(int) (Math.random() * 3)], ((int) (Math.random() * 20)));
        }
        System.out.println(Arrays.toString(cats));

        Integer[][] darr = new Integer[5][5];

        for (int i = 0; i < darr.length; i++) {
            for (int j = 0; j < darr[i].length; j++) {
//                darr[i][j] = new Cat(namesforcat[(int) (Math.random() * 3)], ((int) (Math.random()*20)));
                darr[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < darr.length; i++) {
            System.out.print(i + " : ");
            for (int j = 0; j < darr[i].length; j++) {
//                darr[i][j] = new Cat(namesforcat[(int) (Math.random() * 3)], ((int) (Math.random()*20)));
                System.out.print(darr[i][j] + "  ");
            }
            System.out.println();
        }
        int[] arr2 = new int[] {1,43,21,245};
        for (int i = arr2.length - 1 ; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr2[j] >arr2[j]){
                    int tmp = arr2[j + 1];
                    arr2[j] = arr2 [j+1];
                    arr2[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr2));
        int[] clonedarr = Arrays.copyOf(arr2,10);
        int[] coopyofrange = Arrays.copyOfRange(clonedarr, 1, 4);
        System.out.println(Arrays.toString(clonedarr));
        int[] copy = new int[4];
        for (int i =0; i< arr2.length; i++){
            copy[i] = arr2[i];
        }
        Arrays.sort(copy);
        System.out.println(Arrays.toString(clonedarr));
        System.out.println(Arrays.toString(coopyofrange));
        System.out.println(Arrays.equals(coopyofrange, clonedarr));
        int[][] deepone = { {1,2}, {3,4}};
        int[][] deeptwo = Arrays.copyOf(deepone, deepone.length);
        System.out.println(Arrays.deepEquals(deepone, deeptwo));
        System.out.println(Arrays.deepToString(deeptwo));
    }

    public <T extends Comparable<T>> void dvToString(T[][] arr) {
        for(int i = 0; i< arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
