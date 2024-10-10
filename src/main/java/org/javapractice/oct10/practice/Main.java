package org.javapractice.oct10.practice;

import org.javapractice.oct10.practice.task1.MiddleNum;
import org.javapractice.oct10.practice.task2.Matrix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Throwable, InterruptedException {
        var middleNum = new MiddleNum();
        middleNum.fillArray();
        System.out.println(middleNum.getMiddle());
        System.out.println(Arrays.toString(middleNum.getArrayInt()));

        var matrix = new Matrix(3);
        matrix.fillMatrix();
        matrix.getMaxChetElement();
        System.out.println(matrix.getMaxEl());
        System.out.println(matrix.getColumnWithMax());
    }
}
