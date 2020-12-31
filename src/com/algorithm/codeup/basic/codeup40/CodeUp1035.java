package com.algorithm.codeup.basic.codeup40;

import java.util.Scanner;

/**
 * 입력 : 16진 정수 1개가 입력된다.
 * (단, 16진수는 영문 소문자로 입력된다.)
 *
 * 출력 : 8진수로 바꾸어 출력한다.
 */
public class CodeUp1035 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        int num = Integer.parseInt(word, 16);
        System.out.printf("%o",num);
    }
}
