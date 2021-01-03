package com.algorithm.codeup.basic.codeup60;

import java.util.Scanner;

/**
 * 입력 : 정수 1개가 입력된다.(단, 0 또는 1 만 입력된다.)
 *
 * 출력 : 입력된 값이 0이면 1, 1이면 0을 출력한다.
 */
public class CodeUp1053 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a == 0 ? 1 : 0);
    }
}
