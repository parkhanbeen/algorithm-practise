package com.algorithm.codeup.basic.codeup50;

import java.util.Scanner;

/**
 * 입력 : 정수 2개(a, b)가 공백을 두고 입력된다.
 * 단, -2147483648 <= a <= b <= +2147483647
 *
 * 출력 : a를 b로 나눈 몫을 출력한다.
 */
public class CodeUp1042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.print(a/b);
    }
}
