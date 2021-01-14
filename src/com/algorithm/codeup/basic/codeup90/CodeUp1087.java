package com.algorithm.codeup.basic.codeup90;

import java.util.Scanner;

/**
 * 입력 : 언제까지 합을 계산할 지, 정수 1개를 입력받는다.
 * 단, 입력되는 자연수는 100,000,000이하이다.
 *
 * 출력 : 1, 2, 3, 4, 5 ... 순서대로 계속 더해가다가, 그 합이 입력된 정수보다 커지거나 같아지는 경우,
 * 그때까지의 합을 출력한다.
 */
public class CodeUp1087 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int sum = 0;

        for (int i = 1; true; i++) {
            if (h <= sum) {
                break;
            }
            sum += i;

        }
        System.out.println(sum);
    }


}


