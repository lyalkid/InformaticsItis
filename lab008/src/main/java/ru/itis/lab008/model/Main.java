package ru.itis.lab008.model;

import ru.itis.lab008.model.Matrix2;

public class Main {
    public static void main(String ... args) {
        Matrix2 matrix2 = new Matrix2();

        matrix2.setValue(1,1, 4);

        System.out.println(matrix2.toString());

        Matrix2 matrix21 = new Matrix2(new double[][]{{1,1},{2,3}});
        System.out.println(matrix21.toString());

    }
}
