package com.algorithm.codeup.basic.codeup70;

import java.util.Scanner;

/**
 * 입력 : 2개의 정수가 공백을 두고 입력된다.
 * -2147483648 ~ +2147483647
 *
 * 출력 : 두 정수를 비트단위(bitwise)로 xor 계산을 수행한 결과를 10진수로 출력한다.
 */
public class CodeUp1062 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a ^ b);
    }
}
