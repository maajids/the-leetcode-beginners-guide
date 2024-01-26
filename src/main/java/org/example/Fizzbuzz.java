package org.example;

import java.util.ArrayList;
import java.util.List;

public class Fizzbuzz {

    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            String value = String.valueOf(i);

            if ((i % 3 == 0) && (i % 5 == 0)) {
                value = "FizzBuzz";
            } else if (i % 5 == 0) {
                value = "Buzz";
            } else if (i % 3 == 0) {
                value = "Fizz";
            }


            result.add(value);
        }

        return result;
    }
}
