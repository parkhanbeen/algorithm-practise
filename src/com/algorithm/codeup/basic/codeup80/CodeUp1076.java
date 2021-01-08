package com.algorithm.codeup.basic.codeup80;

import java.util.Scanner;

/**
 * 입력 : 영문자 1개가 입력된다.
 * (a ~ z)
 *
 * 출력 : a부터 입력한 문자까지 순서대로 공백을 두고 출력한다.
 */
public class CodeUp1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.next().charAt(0);

        for (int i = 97; i <= a; i++) {
            System.out.println((char)i);
        }

    }

}
