package com.algorithm.codeup.basic.codeup100;

import java.util.Scanner;

/**
 * 입력 : 바둑알이 깔려 있는 상황이 19 * 19 크기의 정수값으로 입력된다.
 * 십자 뒤집기 횟수(n)가 입력된다.
 * 십자 뒤집기 좌표가 횟수(n) 만큼 입력된다. 단, n은 10이하의 자연수이다.
 *
 * 출력 : 십자 뒤집기 결과를 출력한다.
 */
public class CodeUp1097 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[19][19];

        // 들어오는 값 그대로 배열 생성
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        // 뒤집기 횟수
        int n = scanner.nextInt();
        int x, y; // 좌표

        // 뒤집기 횟수만큼 반복
        for (int i = 0; i < n; i++) {
            x = scanner.nextInt();

            // 들어온 x값 확인
            for (int j = 0; j < arr.length; j++) {
                if (arr[x - 1][j] == 0) {
                    arr[x - 1][j] = 1;
                } else {
                    arr[x - 1][j] = 0;
                }
            }

            y = scanner.nextInt();

            // 들어온 y값 확인
            for (int k = 0; k < arr.length; k++) {
                if (arr[k][y - 1] == 0) {
                    arr[k][y - 1] = 1;
                } else {
                    arr[k][y - 1] = 0;
                }
            }
        }

        // 배열출력
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}


