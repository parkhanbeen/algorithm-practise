package com.algorithm.codeup.basic.codeup20;

import java.util.Scanner;

/**
 * 입력 : 연, 월, 일이 ".(닷)"으로 구분되어 입력된다.
 * 출력 : 입력받은 연, 월, 일을 yyyy.mm.dd 형식으로 출력한다.
 * (%02d를 사용하면 2칸을 사용해 출력하는데, 한 자리 수인 경우 앞에 0을 붙여 출력한다.)
 */
public class CodeUp1019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.next();
        String[] d = date.split("\\.");
        int A = Integer.valueOf(d[0]);
        int B = Integer.valueOf(d[1]);
        int C = Integer.valueOf(d[2]);

        System.out.printf("%04d.%02d.%02d", A, B, C);
    }
}
