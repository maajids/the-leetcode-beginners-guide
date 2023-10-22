package org.example;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class RunningSumOneDArray {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        int[] input1 = new int[]{3,1,2,10,1};
        System.out.printf("RunningSumOneDArray of %sis -> %s%n", Arrays.toString(input1), Arrays.toString(runningSum(input1)));
    }

    public static int[] runningSum(int[] nums) {
        int[] output = new int[nums.length];

        for (int i = 0 ; i < nums.length; i++){
            if(i == 0){
                output[i] = nums[i] + i;
            }else{
                output[i] = nums[i] + output[i-1];
            }

        }

        return output;
    }
}