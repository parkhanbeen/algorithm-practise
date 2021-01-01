package com.algorithm.codeup.basic.codeup40;

import java.util.Scanner;

/**
 * 입력 : 정수 1개가 입력된다.
 *
 * 출력 : 부호를 바꿔 출력한다.
 */
public class CodeUp1040 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.printf("%d", a * -1);
    }
}
