package org.codekatas;

import static java.lang.Integer.parseInt;

public class StringCalculator {

    private final Splitter splitter;

    public StringCalculator(Splitter splitter) {
        this.splitter = splitter;
    }

    public int add(String string) {
        if ("".equals(string)) {
            return 0;
        }

        String[] numbers = splitter.splitString(string);

        checkForNegatives(numbers);

        return sumNumbers(numbers);
    }

    private void checkForNegatives(String[] numbers) {
        String negatives = "";

        for (String number : numbers) {
            if (number.startsWith("-")) {
                negatives += " " + number;
            }
        }

        if (!"".equals(negatives)) {
            throw new RuntimeException("Negatives not allowed:" + negatives);
        }
    }

    private int sumNumbers(String[] numbers) {
        int sum = 0;

        for (String number : numbers) {
            sum += parseInt(number);
        }

        return sum;
    }
}