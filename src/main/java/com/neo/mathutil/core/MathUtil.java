package com.neo.mathutil.core;

public class MathUtil {

    public static long getFactorial(int n) {
        long result = 1;

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n");
        }

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
// Code chính, Code base, Code dân dev phải làm