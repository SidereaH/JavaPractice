package org.javapractice.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MaxConsecuenceArray {
    public static int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        else if(countOnes(nums)==0) {
            return 0;
        }
        int[] placesOfOnes = new int[countOnes(nums)];
        for(int i = 0; i < placesOfOnes.length; i++) {
            placesOfOnes[i] = 1;
        }
        int place = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 1) {
                if (nums[i] == nums[i+1]) {
                    placesOfOnes[place]++;
                }else{
                    place++;
                }
            }
        }
        System.out.println(Arrays.toString(placesOfOnes));
        return Arrays.stream(placesOfOnes).max().getAsInt();
    }

    private static int countOnes(int[] nums) {
        int count = 0;
        for(int num : nums) {
            if (num == 1) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] nums = {1,0,0,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
        

    }

}
