package com.algorithm.codeup.basic.codeup30;

import java.util.Scanner;

/**
 * 입력 : 단어(영어) 하나를 입력받는다.
 * (단, 단어의 길이는 20자 이하이다.)
 *
 * 출력 : 단어의 문자(영어)를 하나씩 나누어 한 줄에 한 개씩
 * ' '로 묶어서 출력한다.
 */
public class CodeUp1024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        String[] d = word.split("");

        for (String s : d) {
            System.out.println("'" + s + "'");
        }
    }
}
