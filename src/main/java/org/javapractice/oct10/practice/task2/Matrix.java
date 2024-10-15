package org.javapractice.oct10.practice.task2;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    //В программе, где требуется для квадратной матрицы с элементами,
    // введенными с клавиатуры, вывести максимальный четный элемент
    // на побочной диагонали (из левого нижнего угла, в правый верхний угол), могут возникать ошибки в следующих
    // случаях: – ввод строки вместо числа; – нет четных чисел.

    private int[][] matrix;
    private int maxEl;
    private int[] pobDial;
    private int columnWithMax;
    public Matrix(int length) {
        matrix = new int[length][length];
        pobDial = new int[length];
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public int getMaxEl() {
        return maxEl;
    }
    public void fillMatrix() throws NoEvenNumberFoud {
        System.out.println("Заполните строки матриц:");
        var in = new Scanner(System.in);
        for (int i = 0; i<matrix.length; i++) {
            System.out.println(i+1 + "строка");
            for (int j = 0; j<matrix[i].length; j++) {
                if(in.hasNextInt()){
                    matrix[i][j] = in.nextInt();
                }
            }
        }
    }

    public int getColumnWithMax() {
        return columnWithMax;
    }

    public void getMaxChetElement() throws NoEvenNumberFoud{
        for (int i = 0; i < matrix.length; i++) {
            pobDial[i] = matrix[matrix.length - i - 1][i];
        }
        this.maxEl = getMax(pobDial);
        System.out.println("diagonal"+Arrays.toString(pobDial));
        System.out.println(Arrays.deepToString(matrix));
    }
    private int getMax(int[] arr) throws NoEvenNumberFoud{
        int max = (int) Double.NEGATIVE_INFINITY;
        for(int i =0; i< arr.length; i++){
            if (arr[i] % 2 ==0){
                if (max < arr[i]){
                    max = arr[i];
                    this.columnWithMax = i;
                }
            }
        }
        if (max == (int) Double.NEGATIVE_INFINITY){
            throw new NoEvenNumberFoud("В матрице отсутствуют четные числа в побочной диагонали");
        }
        return max;
    }
}
