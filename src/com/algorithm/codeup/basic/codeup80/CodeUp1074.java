package com.algorithm.codeup.basic.codeup80;

import java.util.Scanner;

/**
 * 입력 : 정수 1개가 입력된다.
 * (1 ~ 100)
 *
 * 출력 : 1씩 줄이면서 한 줄에 하나씩 1이 될 때까지 출력한다.
 */
public class CodeUp1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = a; i > 0; i--) {
            System.out.println(a--);
        }

    }

}
