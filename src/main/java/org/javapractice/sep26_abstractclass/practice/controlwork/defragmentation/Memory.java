package org.javapractice.sep26_abstractclass.practice.controlwork.defragmentation;

import java.util.Arrays;

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
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        memory = executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }
}
