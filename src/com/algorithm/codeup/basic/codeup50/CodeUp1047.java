package com.algorithm.codeup.basic.codeup50;

import java.util.Scanner;

/**
 * 입력 : 정수 한 개가 입력된다.
 * 단, -1073741824 ~ +1073741823
 *
 * 출력 : 2배 곱한 정수를 출력한다.
 */
public class CodeUp1047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a * 2);
    }
}
