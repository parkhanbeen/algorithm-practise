package com.algorithm.codeup.basic.codeup90;

import java.util.Scanner;

/**
 * 입력 : 정수 1개를 입력받는다.
 * (1 ~ 100)
 *
 * 출력 : 1부터 입력한 정수보다 작거나 같을 때까지 1씩 증가시켜 출력하되
 * 3의 배수는 출력하지 않는다.
 */
public class CodeUp1088 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();

        for (int i = 1; true; i++) {

            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i +" ");

            if (h <= i) {
                break;
            }

        }
    }


}


