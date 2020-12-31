package com.algorithm.codeup.basic.codeup40;

import java.util.Scanner;

/**
 * 입력 : 10진수 1개가 입력된다.
 * 단, 입력되는 정수는 int 범위이다.
 *
 * 출력 : 8진수로 출력한다.
 */
public class CodeUp1031 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int word = scanner.nextInt();

        System.out.printf("%o",word);
    }
}
