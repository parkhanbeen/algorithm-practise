package com.algorithm.codeup.basic.codeup50;

import java.util.Scanner;

/**
 * 입력 : 정수 2개가 공백을 두고 입력된다.
 *
 * 출력 : 첫 줄에 합
 * 둘째 줄에 차,
 * 셋째 줄에 곱,
 * 넷째 줄에 몫,
 * 다섯째 줄에 나머지,
 * 여섯째 줄에 나눈 값을 순서대로 출력한다.
 * (실수, 소수점 이하 셋째 자리에서 반올림해 둘째 자리까지 출력)
 */
public class CodeUp1045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println((a + b));
        System.out.println((a - b));
        System.out.println((a * b));
        System.out.println((a / b));
        System.out.println((a % b));
        System.out.printf("%.2f", ((float)a / (float) b));
    }
}
