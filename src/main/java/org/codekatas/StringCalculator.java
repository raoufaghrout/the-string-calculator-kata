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

        return sumNumbers(splitter.splitString(string));
    }

    private int sumNumbers(String[] numbers) {
        int sum = 0;

        for (String number : numbers) {
            sum += parseInt(number);
        }

        return sum;
    }
}