package org.codekatas;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class StringCalculatorTest {

    private Splitter splitter = new Splitter();
    private StringCalculator calculator = new StringCalculator(splitter);

    @Test
    public void shouldReturnZeroForAnEmptyString() {
        assertThat(calculator.add(""), is(0));
    }

    @Test
    public void shouldReturnOneForAStringContainingOne() {
        assertThat(calculator.add("1"), is(1));
    }

    @Test
    public void shouldReturnSumOfTwoCommaDelimitedStrings() {
        assertThat(calculator.add("1,2"), is(3));
    }

    @Test
    public void shouldReturnSumOfMultipleCommaDelimitedStrings() {
        assertThat(calculator.add("1,2,3,4"), is(10));
    }

    @Test
    public void shouldReturnSumOfMultipleCommaAndNewLineDelimitedStrings() {
        assertThat(calculator.add("1\n2,3\n4"), is(10));
    }

    @Test
    public void shouldReturnSumOfMultipleCustomDelimitedStrings() {
        assertThat(calculator.add("//;\n1;2"), is(3));
    }

    @Test
    public void shouldThrowExceptionForNegatives() {
        try {
            calculator.add("-3,2,-23,5");
        } catch (Exception e) {
            assertThat(e.getMessage(), is("Negatives not allowed: -3 -23"));
        }
    }
}