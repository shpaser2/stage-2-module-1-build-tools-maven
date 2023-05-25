package com.epam.demo;

import com.epam.utils.StringUtils;
import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
       boolean allArePositive = false;
        for (String s : args) {
            allArePositive = StringUtils.isPositiveNumber(s);
            if (!allArePositive) {
                break;
            }
        }
        return allArePositive;
    }
}