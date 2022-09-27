package com.gfa.exam.multiply_matrix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyMatrixTest {

    MultiplyMatrix multiplyMatrix;
    int[][] input = {
            {1, 3, 6, 2},
            {7, 5, 6, 1},
            {3, 3, 1, 5},
            {9, 0, 5, 3}
    };
    int[][] output = {
            {1, 3, 12, 4},
            {14, 10, 6, 2},
            {3, 3, 1, 5},
            {18, 0, 10, 6}
    };

    @Test
    void testMultiplyMatrixNormal() {
        assertEquals(Arrays.deepToString(output), Arrays.deepToString(MultiplyMatrix.multiplyMatrix(input)));
    }
}