package com.algorithm.codeup.basic.codeup40;

import java.util.Scanner;

/**
 * 입력 : 2개의 정수가 공백으로 구분되어 입력된다.
 * ** 주의 : 계산의 결과가 int 범위를 넘어가는지를 잘 생각해 보아야 한다.
 *
 * 출력 : 두 정수의 합을 출력한다.
 */
public class CodeUp1038 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        System.out.printf("%.0f", a+b);
    }
}
