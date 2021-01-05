package com.algorithm.codeup.basic.codeup70;

import java.util.Scanner;

/**
 * 입력 : 3개의 정수가 공백으로 구분되어 입력된다.
 * -2147483648 ~ +2147483648
 *
 * 출력 : 가장 작은 값을 출력한다.
 */
public class CodeUp1064 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println((a > b ? b : a) > c ? c : (a > b ? b : a));
    }
}
