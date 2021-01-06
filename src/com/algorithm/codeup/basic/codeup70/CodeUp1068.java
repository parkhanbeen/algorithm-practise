package com.algorithm.codeup.basic.codeup70;

import java.util.Scanner;

/**
 * 입력 : 영문자 1개가 입력된다.
 * (A, B, C, D 등의 한 문자가 입력된다.)
 *
 * 출력 : 평가내용에 따라 다른 내용이 출력된다.
 */
public class CodeUp1068 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();

        if ("A".equals(a)) {
            System.out.println("best!!!");
        } else if ("B".equals(a)) {
            System.out.println("good!!");
        } else if ("C".equals(a)) {
            System.out.println("run!");
        } else if ("D".equals(a)) {
            System.out.println("slowly~");
        } else {
            System.out.println("what?");
        }
    }
}
