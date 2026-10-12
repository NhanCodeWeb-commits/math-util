package com.neo.mathutil.core;

import org.junit.jupiter.api.Test;

import static com.neo.mathutil.core.MathUtil.getFactorial;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {

    //Test case 1: Test hàm với đầu vào n = 6 hi vọng trả về 720
    @Test
    void testFactorialGivenValidN6ReturnsWell720() {
        int n = 6;
        long expected = 720;
        long actual = getFactorial(n);

        // So sánh tự động giúp expected == actual ?
        // Nếu == thì màu xanh
        // Nếu != thì màu đỏ

        assertEquals(expected, actual);
    }
    //Test case 3: Test hàm với đầu vào n = 0 hi vọng trả về 1
    @Test
    void testFactorialGivenValidN5ReturnsWell120() {
        int n = 5;
        long expected = 120;
        long actual = getFactorial(n);

        // So sánh tự động giúp expected == actual ?
        // Nếu == thì màu xanh
        // Nếu != thì màu đỏ

        assertEquals(expected, actual);
    }

    @Test
    void testFactorialGivenValidN0ReturnsWell1() {
        int n = 0;
        long expected = 1;
        long actual = getFactorial(n);

        // So sánh tự động giúp expected == actual ?
        // Nếu == thì màu xanh
        // Nếu != thì màu đỏ

        assertEquals(expected, actual);
    }

    //Test case 4: Test hàm với đầu vào không hợp lệ
    // n = -1, hy vọng hàm trả về NGOẠI LỆ!! IllegalAgrumentException
    @Test
    void testFactorialGivenInvalidMinus1ThrowsException() {

        assertThrows(IllegalArgumentException.class, () -> {getFactorial(-1);});
    }


}