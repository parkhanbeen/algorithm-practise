package com.algorithm.codeup.basic.codeup40;

import java.util.Scanner;

/**
 * 입력 : 8진 정수 1개가 입력된다.
 *
 * 출력 : 10진수로 바꾸어 출력한다.
 */
public class CodeUp1034 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        int num = Integer.parseInt(word, 8);
        System.out.printf("%d",num);
    }
}
