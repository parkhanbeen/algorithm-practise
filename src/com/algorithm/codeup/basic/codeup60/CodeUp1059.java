package com.algorithm.codeup.basic.codeup60;

import java.util.Scanner;

/**
 * 입력 : 정수 1개가 입력된다.
 * -2147483648 ~ +2147483647
 *
 * 출력 : 비트 단위로 1 -> 0, 0 -> 1로 바꾼 후 그 값을 10진수로 출력한다.
 */
public class CodeUp1059 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(~a);
    }
}
