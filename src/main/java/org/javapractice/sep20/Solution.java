package org.javapractice.sep20;

import java.util.Arrays;

public class Solution {
    static int[] firstArray = {1,12,4,2,1};
    static int[] secondArray = {12,3,2,1,1,1,1,1,0};

    public static void main(String[] args) {
        int[] result = sumTwoArrays(firstArray, secondArray);
        System.out.println(Arrays.toString((result)));
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
