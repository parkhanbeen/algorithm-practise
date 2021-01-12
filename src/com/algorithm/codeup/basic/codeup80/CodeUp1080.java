package com.algorithm.codeup.basic.codeup80;

import java.util.Scanner;

/**
 * 입력 : 정수 1개가 입력된다.
 *
 * 출력 : 1, 2, 3, 4, 5 ... 를 순서대로 계속 더해 합을 만들어가다가,
 * 입력된 정수와 같거나 커졌을 때, 마지막에 더한 정수를 출력한다.
 */
public class CodeUp1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int sum = 0;
        for (int i = 0; true; i++) {
            sum += i;
            if (a <= sum){
                System.out.println(i);
                break;
            }

        }

    }

}
