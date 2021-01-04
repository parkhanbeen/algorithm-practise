package com.algorithm.codeup.basic.codeup70;

import java.util.Scanner;

/**
 * 입력 : 2개의 정수가 공백을 두고 입력된다.
 * -2147483648 ~ +2147483647
 *
 * 출력 : 두 정수 중 큰 값을 10진수로 출력한다.
 */
public class CodeUp1063 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a > b ? a : b);
    }
}
