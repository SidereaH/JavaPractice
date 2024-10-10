package org.javapractice.oct10.practice.task1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MiddleNum {
    //В программе, вычисляющей среднее значение среди положительных элементов
    // одномерного массива (тип элементов int), вводимого с клавиатуры, могут
    // возникать ошибки в следующих случаях: – ввод строки вместо числа;
    // – несоответствие числового типа данных; – положительные элементы отсутствуют.
    private int[] arrayInt = new int[5];
    private int middle;

    public MiddleNum() {

    }

    public int[] getArrayInt() {
        return arrayInt;
    }

    public int getMiddle() {
        return middle;
    }
    private void setMiddle(int middle) {
        this.middle = middle;

    }

    public void fillArray() throws NumIsNotPositive, StringToNumException {
        var in = new Scanner(System.in);
        System.out.println("Write 5 positive nums, to fill array");
        for (int i = 0; i < arrayInt.length; i++) {

                if (in.hasNextInt()) {
                    String num = in.nextLine();
                    if (check(num)){
                        int nnum = Integer.parseInt(num);
                        if (nnum > 0) {
                            arrayInt[i] = nnum;
                        } else {
                            throw new NumIsNotPositive("You must write only positive numbers");
                        }
                    }
                    else{
                        throw new StringToNumException("You write String!");
                    }
                }
        }
        getMiddleOfArray();
    }
    private void getMiddleOfArray(){
        int sumOfAll = 0;
        for(int num : arrayInt){
            sumOfAll += num;
        }
         setMiddle(sumOfAll / arrayInt.length);
    }
    public static boolean check(String integer) {
        Pattern p = Pattern.compile("^[0-9]*[.]?[0-9]+$");
        Matcher m = p.matcher(integer);
        return m.matches();
    }
}