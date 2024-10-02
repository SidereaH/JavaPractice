package org.javapractice.october1.interfaces.practice.task2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();
        var in = new Scanner(System.in);
        String fileName = null;
        do{
            System.out.println("Write filename:");
            fileName = in.nextLine();
        } while(fileName.isEmpty());

        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("Файл создан");
            } else {
                System.out.println("Файл уже существует");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла");
            e.printStackTrace();
        }

        String newString = null;
        System.out.print("Write lines to file. If you want to exit just type 'exit'");
        do{
            newString = in.nextLine();
            if (!newString.equalsIgnoreCase("exit")){
                lines.add(newString);
            }
        }while(!newString.equalsIgnoreCase("exit"));

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName)))
        {
            for (String line : lines){
                bw.write(line+"\n");
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}