package com.algorithm.codeup.basic.codeup40;

import java.util.Scanner;

/**
 * 입력 : 10진수 1개가 입력된다.
 *
 * 출력 : 16진수(대문자)로 출력한다.
 */
public class CodeUp1033 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int word = scanner.nextInt();

        System.out.printf("%X",word);
    }
}
