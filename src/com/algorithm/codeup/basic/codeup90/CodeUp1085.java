package com.algorithm.codeup.basic.codeup90;

import java.util.Scanner;

/**
 * 입력 : h, b, c, s 가 공백을 두고 입력된다.
 * h는 48,000이하, b는 32이하(단, 8의배수), c는 5이하, s는 6,000이하의 자연수이다.
 *
 * 출력 : 필요한 저장 공간을 MB 단위로 바꾸어 출력한다.
 * 단, 소수점 둘째 자리에서 반올림해 첫째 자리까지 출력하고 MB를 공백을 두고 출력한다.
 */
public class CodeUp1085 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long s = sc.nextLong();
        double total = 0;

        total = h*b*c*s;



        double result = ((total/8)/Math.pow(2, 10)/Math.pow(2, 10));
        System.out.format("%.1f MB",result);

    }


}


