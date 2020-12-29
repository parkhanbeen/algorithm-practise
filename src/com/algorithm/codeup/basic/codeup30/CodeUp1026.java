package com.algorithm.codeup.basic.codeup30;

import java.util.Scanner;

/**
 * 입력 : 시 분 초가
 * 시:분:초 형식으로 입력된다.
 *
 * 출력 : 분만 출력한다.
 */
public class CodeUp1026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        String[] splitWord = word.split(":");

        System.out.println(Integer.valueOf(splitWord[1]));
    }
}
