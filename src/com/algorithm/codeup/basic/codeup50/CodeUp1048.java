package com.algorithm.codeup.basic.codeup50;

import java.util.Scanner;

/**
 * 입력 : 정수 2개가 공백을 두고 입력된다.
 * 0 <= a, b <= 10
 *
 * 출력 : a 를 2b배 만큼 곱한 값을 출력한다.
 */
public class CodeUp1048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a << b);
    }
}
