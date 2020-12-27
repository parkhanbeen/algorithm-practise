package com.algorithm.codeup.basic.codeup30;

import java.util.Scanner;

/**
 * 입력 : 공백이 포함되어 있는 한 문장이 입력된다.
 * 단, 입력되는 문장은 여러 개의 단어로 구성되고, 엔터로 끝나며,
 * 최대 길이는 2000 문자를 넘지 않는다.
 *
 * 출력 : 입력된 문장을 그대로 출력한다.
 */
public class CodeUp1022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();

        System.out.printf(date);
    }
}
