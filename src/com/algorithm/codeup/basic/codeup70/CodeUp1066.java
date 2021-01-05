package com.algorithm.codeup.basic.codeup70;

import java.util.Scanner;

/**
 * 입력 : 세 정수 a, b, c 가 공백을 두고 입력된다.
 * 0 <= a, b, c <= +2147483647
 *
 * 출력 : 입력된 순서대로 짝(even)/홀(odd)을 줄을 바꿔 출력한다.
 */
public class CodeUp1066 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a % 2 == 0 ? "even" : "odd");
        System.out.println(b % 2 == 0 ? "even" : "odd");
        System.out.println(c % 2 == 0 ? "even" : "odd");
    }
}
