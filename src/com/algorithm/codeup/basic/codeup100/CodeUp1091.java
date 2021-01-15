package com.algorithm.codeup.basic.codeup100;

import java.util.Scanner;

/**
 * 입력 : 시작 값(a), 등차의 값(d), 몇 번째 수 인지를 의미하는 정수(n)가
 * 공백을 두고 입력된다.(모두 0 ~ 100)
 *
 * 출력 : n번째 수를 출력한다.
 */
public class CodeUp1091 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 시작 값
        int b = sc.nextInt(); // 등차
        int c = sc.nextInt(); // 몇 번째 수

        int sum = a;

        for (int i = 1; i < c; i++) {
            sum += b;
        }
        System.out.println(sum);


    }


}


