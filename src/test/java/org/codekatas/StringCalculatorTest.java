package org.codekatas;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class StringCalculatorTest {

    @Test
    public void shouldReturnZeroForAnEmptyString() {
        StringCalculator calculator = new StringCalculator();

        assertThat(calculator.add(""), is(0));
    }

    @Test
    public void shouldReturnOneForAStringContainingOne() {
        StringCalculator calculator = new StringCalculator();

        assertThat(calculator.add("1"), is(1));
    }

    @Test
    public void shouldReturnSumOfTwoStringsCommaSeparated() {
        StringCalculator calculator = new StringCalculator();

        assertThat(calculator.add("1,2"), is(3));
    }

    @Test
    public void shouldReturnSumOfMultipleStringsCommaSeparated() {
        StringCalculator calculator = new StringCalculator();

        assertThat(calculator.add("1,2,3,4"), is(10));
    }
}