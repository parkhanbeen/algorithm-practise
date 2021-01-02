package com.algorithm.codeup.basic.codeup50;

import java.util.Scanner;

/**
 * 입력 : 정수 1개가 입력된다.
 * 단, -2147483648 ~ +2147483647 의 범위로 입력된다.
 *
 * 출력 : 입력된 정수에 1을 더해 출력한다.
 */
public class CodeUp1044 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.printf("%.0f", a + 1);
    }
}
