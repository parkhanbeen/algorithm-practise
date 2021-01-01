package com.algorithm.codeup.basic.codeup40;

import java.util.Scanner;

/**
 * 입력 : 10진 정수 1개(0 ~ 255 범위)가 입력된다.
 *
 * 출력 : 아스키코드 값을 문자로 출력한다.
 */
public class CodeUp1037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int word = scanner.nextInt();
        System.out.println((char) word);
    }
}
