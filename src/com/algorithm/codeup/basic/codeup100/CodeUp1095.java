package com.algorithm.codeup.basic.codeup100;

import java.util.Scanner;

/**
 * 입력 : 번호를 부른 횟수(n, 1 ~ 10000)가 첫 줄에 입력된다.
 * n개의 랜덤 번호(k, 1 ~ 23)가 두 번째 줄에 공백을 사이에 두고 순서대로 입력된다.
 *
 * 출력 : 출석을 부른 번호 중에 가장 빠른 번호를 1개만 출력한다.
 */
public class CodeUp1095 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] num = new int[n];

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        int temp = num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] < temp) {
                temp = num[i];
            }
        }
        System.out.println(temp);

    }
}


