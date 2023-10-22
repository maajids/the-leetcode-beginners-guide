package org.example;

import java.util.Arrays;

public class RichestCustomerWealth {

    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");
        int [][] inputMatrix1;
        int [][] inputMatrix2;

        inputMatrix1 = new int[2][3]; // output should be 6
        inputMatrix1[0][0] = 1;
        inputMatrix1[0][1] = 2;
        inputMatrix1[0][2] = 3;

        inputMatrix1[1][0] = 3;
        inputMatrix1[1][1] = 2;
        inputMatrix1[1][2] = 1;

        inputMatrix2 = new int[3][2];// output should be 10

        inputMatrix2[0][0] = 1;
        inputMatrix2[0][1] = 5;

        inputMatrix2[1][0] = 7;
        inputMatrix2[1][1] = 3;

        inputMatrix2[2][0] = 3;
        inputMatrix2[2][1] = 5;


        System.out.println("RichestCustomerWealth for input -> "+ Arrays.toString(inputMatrix1) +"-> is -> "+ String.valueOf(maximumWealth(inputMatrix1)));
        System.out.println("RichestCustomerWealth for input -> "+ Arrays.toString(inputMatrix2) +"-> is -> "+ String.valueOf(maximumWealth(inputMatrix2)));

    }

    public static int maximumWealth(int[][] accounts) {
        int maximumWealth = 0;

        for(int i = 0; i < accounts.length; ++i) {
            int individualSum = 0;
            for(int j = 0; j < accounts[i].length; ++j) {
                individualSum += accounts[i][j];
            }
            maximumWealth = Math.max(maximumWealth,individualSum);
        }

        return maximumWealth;
    }
}
