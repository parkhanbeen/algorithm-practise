package com.algorithm.codeup.basic.codeup50;

import java.util.Scanner;

/**
 * 입력 : 정수 3개가 공백을 두고 입력된다.
 * 단, -2147483648 ~ +2147483647
 *
 * 출력 : 합과 평균을 줄을 바꿔 출력한다.
 * 평균은 소수점 이하 둘째 자리에서 반올림해서 소수점 이하 첫째 자리까지 출력한다.
 */
public class CodeUp1046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int sum = a + b + c;
        float avg = (float)sum / 3;
        System.out.println(a + b + c);
        System.out.printf("%.1f", avg);
    }
}
