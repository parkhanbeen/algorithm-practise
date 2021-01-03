package com.algorithm.codeup.basic.codeup60;

import java.util.Scanner;

/**
 * 입력 : 두 정수 a, b가 공백을 두고 입력된다.
 * -2147483647 <= a, b <= +2147483648
 *
 * 출력 : a와 b가 다른 경우 1을, 그렇지 않은 경우 0을 출력한다.
 */
public class CodeUp1052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a == b ? 0 : 1);
    }
}
