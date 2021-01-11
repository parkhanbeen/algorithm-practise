package com.algorithm.codeup.basic.codeup80;

import java.util.Scanner;

/**
 * 입력 : 정수 1개가 입력된다.
 * (0 ~ 100)
 *
 * 출력 : 1부터 입력된 수까지 짝수의 합을 출력한다.
 */
public class CodeUp1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= a; i++) {
            if (i % 2 ==0 ) {
                sum += i;
            }
        }
                System.out.println(sum);

    }

}
