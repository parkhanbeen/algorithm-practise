package com.algorithm.codeup.basic.codeup70;

import java.util.Scanner;

/**
 * 입력 : 영문자 1개가 입력된다.
 * (A, B, C, D 등의 한 문자가 입력된다.)
 *
 * 출력 : 입력된 정수에 대해
 * 첫 줄에 minus 나 plus 를 출력하고,
 * 두 번째 줄에 odd 나 even 을 출력한다.
 */
public class CodeUp1069 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a >= 90 && a <= 100) {
            System.out.println("A");
        } else if (a >= 70 && a <= 89) {
            System.out.println("B");
        } else if (a >= 40 && a <= 69) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
