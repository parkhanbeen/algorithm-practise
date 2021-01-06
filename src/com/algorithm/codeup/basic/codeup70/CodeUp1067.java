package com.algorithm.codeup.basic.codeup70;

import java.util.Scanner;

/**
 * 입력 : 정수 1개가 입력된다.
 * -2147483648 ~ +2147483647, 단 0은 입력되지 않는다.
 *
 * 출력 : 입력된 정수에 대해
 * 첫 줄에 minus 나 plus 를 출력하고,
 * 두 번째 줄에 odd 나 even 을 출력한다.
 */
public class CodeUp1067 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a < 0) {
            a = a * -1;
            System.out.println("minus");
        } else {
            System.out.println("plus");
        }

        System.out.println(a % 2 == 0 ? "even" : "odd");
    }
}
