package org.javapractice.sep26_abstractclass.practice.controlwork.defragmentation;

import java.util.Arrays;
import java.util.Scanner;

public class Memory {
    public static String[] executeDefragmentation(String[] array) {
        int countNulls = 0;
        for(String obj : array){
            if (obj == null){
                countNulls++;
            }
        }
        String[] newArr = new String[array.length-countNulls];
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if (array[i] != null){
                newArr[i-count] = array[i];
            }
            else count++;
        }
        array = newArr;
        return newArr;
    }

    public static void main(String[] args) {
        System.out.println("Дефрагментация диска.");

        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        System.out.println(Arrays.toString(memory));
        Scanner scanner = new Scanner(System.in);
        String answ = null;
        do {
            System.out.println("Дефрагментировать? Да/Нет  ");
            answ = scanner.next();
        } while (!answ.equalsIgnoreCase("да") && !answ.equalsIgnoreCase("нет"));
        memory = executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }
}
