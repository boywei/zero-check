package com.ecnu.zero.common.util;


public class NumberUtils {

    public static Integer ifNullUseZero(Integer n) {
        return n == null ? 0 : n;
    }
}
