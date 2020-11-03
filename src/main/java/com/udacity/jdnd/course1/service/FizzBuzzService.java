package com.udacity.jdnd.course1.service;

public class FizzBuzzService {

    /**
     * Reverse fizzBuzz. Takes the output value and returns
     * the number that would produce it. The occurrence param
     * indicates how many times the input string should have happened, if counting up from 1.
     *
     * For example, if the input is "Buzz" and occurrence is 2, the output should be 10,
     * because "Buzz" is produced for the values 5 and 10 in FizzBuzz.
     */
    public int buzzFizz(String input, int occurrence) {
        if (input.equals("Fizz")) {
            return 3 * occurrence;
        } else if (input.equals("Buzz")) {
            return 5 * occurrence;
        } else if (input.equals("FizzBuzz")) {
            return 15 * occurrence;
        } else {
            return Integer.valueOf(input);
        }
    }

    /**
     * If number is divisible by 3, return "Fizz". If divisible by 5,
     * return "Buzz", and if divisible by both, return "FizzBuzz". Otherwise,
     * return the number itself.
     *
     * @Throws IllegalArgumentException for values < 1
     */
    public String fizzBuzz(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("Value must be greater than 0");
        } else if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return "" + number;
        }
    }
}
