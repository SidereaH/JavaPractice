package org.javapractice.october1.interfaces.practice.task4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Сортировка четных чисел из файла
*/

public class Solution {

    public static void main(String[] args) throws  IOException {
        ArrayList<Integer> nums = new ArrayList<>();
        String filename = null;
        var in = new Scanner(System.in);
        do{
            System.out.println("Введите название файла");
            filename = in.nextLine();
        }while (filename.isEmpty());
        try(var fileInput = new FileInputStream(filename)){
            int i;
            var input = new Scanner(fileInput);
            String line = null;
            while(input.hasNextLine()){
                line = input.nextLine();
                if (check(line)){
                    int num = Integer.parseInt(line);
                    if(num % 2 == 0){
                        nums.add(num);
                    }
                }
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        Collections.sort(nums);
        System.out.println(nums);
    }

    public static boolean check(String integer) {
        Pattern p = Pattern.compile("^[-+]?[0-9]*\\.?[0-9]+$");
        Matcher m = p.matcher(integer);
        return m.matches();
    }
}