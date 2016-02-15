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
}