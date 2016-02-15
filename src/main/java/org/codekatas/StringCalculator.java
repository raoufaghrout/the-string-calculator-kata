package org.codekatas;

import static java.lang.Integer.parseInt;

public class StringCalculator {

    public int add(String numbers) {
        if ("".equals(numbers)) {
            return 0;
        }

        String[] splitNumbers = splitString(numbers);
        return sumNumbers(splitNumbers);
    }

    private String[] splitString(String numbers) {
        return numbers.split(",|\n");
    }

    private int sumNumbers(String[] splitNumbers) {
        int sum = 0;

        for (String number : splitNumbers) {
            sum += parseInt(number);
        }
        return sum;
    }
}