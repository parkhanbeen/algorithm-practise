package com.algorithm.codeup.basic.codeup30;

import java.util.Scanner;

/**
 * 입력 : 다섯 자리로 이루어진 1개의 정수를 입력받는다.
 * (단, 10,000 <= 입력받는 수 <= 99,999 )
 *
 * 출력 : 각 자리의 숫자를 분리해 한 줄에 하나씩 [ ]속에 넣어 출력한다.
 */
public class CodeUp1025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        char[] chars = word.toCharArray();
        int lenth = chars.length;

        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            System.out.print("[" + aChar);
            for (int j = 1; j < lenth; j++) {
                System.out.print("0");
            }
            System.out.print("]");
            System.out.println();
            lenth--;
        }
    }
}
