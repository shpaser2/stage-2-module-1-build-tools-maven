package com.epam.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UtilsTest {

    @Test
    public void testIsAllPositiveNumbers_PositiveNumbers() {
        List<String> numbers = Arrays.asList("10", "15", "25");
        boolean result = Utils.isAllPositiveNumbers(numbers);
        Assertions.assertTrue(result);
    }

    @Test
    public void testIsAllPositiveNumbers_NegativeNumber() {
        List<String> numbers = Arrays.asList("10", "-5", "25");
        boolean result = Utils.isAllPositiveNumbers(numbers);
        Assertions.assertFalse(result);
    }

    @Test
    public void testIsAllPositiveNumbers_MixedPositiveAndNegativeNumbers() {
        List<String> numbers = Arrays.asList("10", "-5", "25", "0", "-30");
        boolean result = Utils.isAllPositiveNumbers(numbers);
        Assertions.assertFalse(result);
    }

    @Test
    public void testIsAllPositiveNumbers_EmptyList() {
        List<String> numbers = Collections.emptyList();
        boolean result = Utils.isAllPositiveNumbers(numbers);
        Assertions.assertFalse(result);
    }
}
