package com.algorithm.codeup.basic.codeup80;

import java.util.Scanner;

/**
 * 입력 : 첫 줄에 정수의 개수 n이 입력되고,
 * 두 번째 줄에 n개의 정수가 공백을 두고 입력된다.
 * -2147483648 ~ +2147483647, 단 n의 최대 개수는 알 수 없다.
 *
 * 출력 : n개의 정수를 한 개씩 줄을 바꿔 출력한다.
 */
public class CodeUp1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        extracted(sc);

    }

    private static void extracted(Scanner sc) {
        int a = sc.nextInt();
        int arr[] = new int[a];

        //배열에 값을 누적시킨다.
        for(int i=0; i<arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
