package org.javapractice.sep17.multidimensionalarrays;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;

public class Practice {
    public static int N;
    public static void main(String[] args) {

        System.out.println("First task");
        int[] nechetarr = new int[10];
        int count = 1;
        for (int i = 0; i < nechetarr.length; i++){
            nechetarr[i] = count;
            count+=2;
        }
        System.out.println(Arrays.toString(nechetarr));
        System.out.println("Second task");
        System.out.println("print n:");
        var in = new Scanner(System.in);
        if (in.hasNextInt()){
            N = in.nextInt();
        }
        int[] secondarr = new int[N];
        for(int i = 0; i< secondarr.length; i++){
            secondarr[i] = (int) (Math.random() * 100);
        }
        int min = (int) Double.POSITIVE_INFINITY;
        for(int i : secondarr){
            if (min > i){
                min = i;
            }
        }
        System.out.println(Arrays.toString(secondarr) + "\nmin = " + min);
        System.out.println("Third task");
        int max = (int) Double.NEGATIVE_INFINITY;
        for(int i : secondarr){
            if (max < i){
                max = i;
            }
        }
        System.out.println("max = " + max);
        System.out.println("Fourth task");
        int minarrindex = -1;
        int maxarrindex = -1;
        for ( int i = 0; i < secondarr.length; i++){
            if (secondarr[i] == min){
                minarrindex = i;
            } else if (secondarr[i] == max) {
                maxarrindex = i;
            }
        }
        secondarr[minarrindex] = max;
        secondarr[maxarrindex] = min;
        System.out.println(Arrays.toString(secondarr));
        System.out.println("Fifth task");
        int sum = 0;
        for (int i =0; i < secondarr.length; i++){
            sum+=secondarr[i];
        }
        double middlesum = (double) sum /secondarr.length;
        System.out.println(middlesum);

        System.out.println("Sixth task");
        int[][] arrsd = new int[5][6];
        for(int i = 0; i< arrsd.length; i++){
            for (int k = 0; k < arrsd[i].length; k++){
                arrsd[i][k] = (int) (Math.random() * 100);
            }
        }
        System.out.println(Arrays.deepToString(arrsd));
        System.out.println("Seventh task");
        int[][] matrixC = new int[3][3];
        int[][] matrixD = new int[3][3];
        int[][] sumOfMatrix = new int[3][3];
        int[][] multipOfMatrix = new int[3][3];
        for(int i = 0; i< matrixC.length; i++){
            for (int k = 0; k < matrixC[i].length; k++){
                matrixC[i][k] = (int) (Math.random() * 100);
                matrixD[i][k] = (int) (Math.random() * 100);
            }
        }
        printMulti(matrixC);
        printMulti(matrixD);
        System.out.println("Summarizing matrix's");
        for (int i = 0; i < matrixC.length; i++){
            for (int k = 0; k < matrixC[i].length; k++){
                sumOfMatrix[i][k] = matrixC[i][k] + matrixD[i][k];
            }
        }
        printMulti(sumOfMatrix);
        System.out.println("Multiplication matrix's");
        multipOfMatrix = multiply(matrixC, matrixD);

        System.out.println(Arrays.deepToString(multipOfMatrix));
        System.out.println("Eight task");
        int allsum =0;
        for (int i = 0; i < matrixC.length; i++){
            for(int k = 0; k < matrixC[i].length; k++){
                allsum+= matrixC[i][k];
            }
        }
        System.out.println(allsum);

        System.out.println("Ninth task");
        int[][] negpos = new int[][]{{2,4, -9}, {32,6,-78}};
        var positive = new ArrayList<String>();

        var negative = new ArrayList<String>();

        for (int i = 0; i < negpos.length; i++){
            for(int k = 0; k < negpos[i].length; k++){
                if (negpos[i][k] < 0){
                    positive.add(String.format("[%d, %d]", i,k));
                }
                else if (negpos[i][k] > 0){
                    negative.add(String.format("[%d, %d]", i,k));
                }
            }
        }
        System.out.println("Positives: " + positive);
        System.out.println("Negatives: " + negative);
        System.out.println("Tenth task");
        for (int i = 0; i < negpos.length; i++){
            for(int k = 0; k < negpos[i].length; k++){
                Arrays.sort(negpos[i]);
            }
        }
        System.out.println(Arrays.deepToString(negpos));
    }
    private static int[] getStringByIndex(int[][] arr, int indexOfString){
        int[] string = new int[arr[0].length];
        for(int i = 0; i < string.length; i++){
            string[i] = arr[indexOfString][i];
        }
        return string;
    }
    private static int[] getColumnByIndex(int[][] arr, int indexOfColumn){
        int[] column = new int[arr[0].length];
        for(int i = 0; i < column.length; i++){
            column[i] = arr[i][indexOfColumn];
        }
        return column;
    }
    private static int multByIndex(int[] string, int[] column){
        int multSum = 0;
        if (string.length == column.length){
            for (int i = 0; i < string.length; i++){
                multSum+=string[i]*column[i];
            }
        }
        return multSum;
    }
    private static int[][] multiply( int[][] matrixC,  int[][] matrixD) {
        if (matrixC[0].length != matrixD.length) {
            return null;
        }
        var matrixM = new int[matrixC.length][matrixD[0].length];
        for (var i = 0; i < matrixM.length; i++) {
            for (var j = 0; j < matrixM[0].length; j++) {
                matrixM[i][j] = 0;
                for (var k = 0; k < matrixC[0].length; k++) {
                    matrixM[i][j] += matrixC[i][k] * matrixD[k][j];
                }
            }
        }
        return matrixM;
    }
    private static void printMulti(int[][] arrsd){
        for(int i = 0; i< arrsd.length; i++){
            System.out.print("[");
            for (int k = 0; k < arrsd[i].length; k++){
                System.out.print(arrsd[i][k]);
                if (k !=  arrsd.length - 1 ){
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            System.out.println();
        }
        System.out.println("\n");
    }
}
