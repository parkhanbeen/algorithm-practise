package com.algorithm.codeup.basic.codeup100;

import java.util.Scanner;

/**
 * 입력 : 시작 값(a), 곱할 값(m), 더할 값(d), 몇 번째 인지를 나타내는 정수(n)가
 * 공백을 두고 입력된다.(a, m, d는 -50 ~ +50, n은 10이하의 자연수)
 *
 * 출력 : n번째 수를 출력한다.
 */
public class CodeUp1091 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong(); // 시작 값
        long b = sc.nextLong(); // 곱할 값
        long c = sc.nextLong(); // 더할 값
        long d = sc.nextLong(); // 몇 번째

        long sum = a;

        for (int i = 1; i < d; i++) {
            sum = (sum * b) + c;
        }
        System.out.println(sum);


    }
}


