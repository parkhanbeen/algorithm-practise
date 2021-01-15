package com.algorithm.codeup.basic.codeup100;

import java.util.Scanner;

/**
 * 입력 : 시작 값(a), 등비의 값(r), 몇 번째 인지를 나타내는 정수(n)가
 * 공백을 두고 입력된다.(모두 0 ~ 10)
 *
 * 출력 : n번째 수를 출력한다.
 */
public class CodeUp1092 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong(); // 시작 값
        long b = sc.nextLong(); // 등차
        long c = sc.nextLong(); // 몇 번째 수

        long sum = a;

        for (int i = 1; i < c; i++) {
            sum = sum * b;
        }
        System.out.println(sum);


    }
}


