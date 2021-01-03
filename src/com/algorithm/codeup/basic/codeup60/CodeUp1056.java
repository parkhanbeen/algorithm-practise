package com.algorithm.codeup.basic.codeup60;

import java.util.Scanner;

/**
 * 입력 : 1 또는 0의 값만 가지는 2개의 정수가 공백을 두고 입력된다.
 *
 * 출력 : 참/거짓이 서로 다를 때에만 1을 출력하고, 그 외의 경우에는 0을 출력한다.
 */
public class CodeUp1056 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a == b ? 0 : 1);
    }
}
