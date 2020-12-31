package com.algorithm.codeup.basic.codeup40;

import java.util.Scanner;

/**
 * 입력 : 영문자 1개가 입력된다.
 *
 * 출력 : 아스키코드 값을 10진수로 출력한다.
 */
public class CodeUp1036 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char word = scanner.next().charAt(0);
        System.out.println((int)word);
    }
}
