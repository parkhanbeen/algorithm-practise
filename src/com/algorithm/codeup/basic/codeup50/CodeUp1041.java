package com.algorithm.codeup.basic.codeup50;

import java.util.Scanner;

/**
 * 입력 : 영문자 1개가 입력된다.
 *
 * 출력 : 다음 문자를 출력한다.
 */
public class CodeUp1041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextLine().charAt(0);
        System.out.print((char)(a+1));
    }
}
