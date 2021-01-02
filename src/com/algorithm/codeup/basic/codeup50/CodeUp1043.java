package com.algorithm.codeup.basic.codeup50;

import java.util.Scanner;

/**
 * 입력 : 정수 2개(a, b)가 공백을 두고 입력된다.
 * 단, 0 <= a, b <= +2147483647, b는 0이 아니다.
 *
 * 출력 : a 를 b로 나눈 나머지를 출력한다.
 */
public class CodeUp1043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.print(a % b);
    }
}
