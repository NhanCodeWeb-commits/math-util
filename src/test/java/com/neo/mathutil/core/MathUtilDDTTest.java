package com.neo.mathutil.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilDDTTest {
    //CHuẩn bị riêng data test ra 1 chỗ-- DDT
    public static Object[][] initTestData(){
        Object[][] testData={
                {0, 1},
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120}
        };
        return testData;


    }

    //Chính thức test, nhồi data dô hamf assertEquals()
    @ParameterizedTest  //Dùng cái này khi test có tham số
    @MethodSource("initTestData()")
    public void testFactorialGivenValidNRunsWell(int n, long expected){
        assertEquals(expected, MathUtil.getFactorial(n));


    }
}