package org.example;

public class StepsToReduceToZero {

    public static void main(String[] args) {
        System.out.println(numberOfSteps(123));
    }

    public static int numberOfSteps(int num) {

        int totalSteps = 0;
        int iterationInt = num;


        while (iterationInt > 0) {
            boolean isEven = iterationInt % 2 == 0;
            if (isEven) {
                iterationInt = iterationInt / 2;
                totalSteps++;
            } else {
                iterationInt = iterationInt - 1;
                totalSteps++;
            }

        }


        return totalSteps;

    }
}
