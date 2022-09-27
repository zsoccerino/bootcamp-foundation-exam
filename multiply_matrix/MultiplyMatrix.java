package com.gfa.exam.multiply_matrix;

public class MultiplyMatrix {
    public static void main(String[] args) {

    }

    public static int[][] multiplyMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i % 2 != 0 && arr[i][j] % 2 != 0) {
                    arr[i][j] *= 2;
                }
                if (i % 2 == 0 && arr[i][j] % 2 == 0) {
                    arr[i][j] *= 2;
                }
            }
        }
    return arr;
    }
}
