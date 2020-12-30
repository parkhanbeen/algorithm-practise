package com.algorithm.codeup.basic.codeup30;

import java.util.Scanner;

/**
 * 입력 : 년월일이 '.'(닷)으로 구분되어 입력된다.
 *
 * 출력 : 년월일을
 * 일월년으로 바꾸어 '-'(대쉬, 마이너스)로 구분해 출력한다.
 */
public class CodeUp1027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        String[] splitWord = word.split("\\.");

        System.out.println(splitWord[2] + "-" + splitWord[1] + "-" + splitWord[0]);
    }
}
