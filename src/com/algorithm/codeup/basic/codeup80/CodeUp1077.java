package com.algorithm.codeup.basic.codeup80;

import java.util.Scanner;

/**
 * 입력 : 정수 1개가 입력된다.
 * (0 ~ 100)
 *
 * 출력 : 0부터 그 수까지 줄을 바꿔 한 개씩 출력한다.
 */
public class CodeUp1077 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 0; i <= a; i++) {
            System.out.println(i);
        }

    }

}
