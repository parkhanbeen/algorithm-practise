package com.algorithm.codeup.basic.codeup40;

import java.util.Scanner;

/**
 * 입력 : 2개의 정수가 공백으로 구분되어 입력된다.
 *
 * 출력 : 두 정수의 합을 출력한다.
 */
public class CodeUp1039 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.printf("%.0f", a+b);
    }
}
