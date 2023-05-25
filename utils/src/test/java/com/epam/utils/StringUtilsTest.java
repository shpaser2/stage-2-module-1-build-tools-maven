package com.epam.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    public void testIsPositiveNumber_PositiveDoubleNumber() {
        String number = "123.45";
        boolean result = StringUtils.isPositiveNumber(number);
        Assertions.assertTrue(result);
    }

    @Test
    public void testIsPositiveNumber_NegativeDoubleNumber() {
        String number = "-67.89";
        boolean result = StringUtils.isPositiveNumber(number);
        Assertions.assertFalse(result);
    }

    @Test
    public void testIsPositiveNumber_PositiveNumber() {
        String number = "5";
        boolean result = StringUtils.isPositiveNumber(number);
        Assertions.assertTrue(result);
    }

    @Test
    public void testIsPositiveNumber_NegativeNumber() {
        String number = "-7";
        boolean result = StringUtils.isPositiveNumber(number);
        Assertions.assertFalse(result);
    }

    @Test
    public void testIsPositiveNumber_Zero() {
        String number = "0";
        boolean result = StringUtils.isPositiveNumber(number);
        Assertions.assertFalse(result);
    }

    @Test
    public void testIsPositiveNumber_NonNumericString() {
        String str = "abc";
        boolean result = StringUtils.isPositiveNumber(str);
        Assertions.assertFalse(result);
    }
}
