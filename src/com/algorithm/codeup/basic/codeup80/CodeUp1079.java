package com.algorithm.codeup.basic.codeup80;

import java.util.Scanner;

/**
 * 입력 : 문자들이 1개씩 계속해서 입력된다.
 *
 * 출력 : 'q'가 입력될 때까지 입력된 문자를 줄을 바꿔 한 줄씩 출력한다.
 */
public class CodeUp1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

        String a = sc.next();
        System.out.println(a);

        if ("q".equals(a)) {
            break;
        }
        }

    }

}
