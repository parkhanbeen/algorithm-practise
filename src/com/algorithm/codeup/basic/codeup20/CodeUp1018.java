package com.algorithm.codeup.basic.codeup20;

import java.util.Scanner;

/**
 * 입력 : 시(hour)와 분(minute)이 ":" 으로 구분되어 입력된다.
 * 출력 : 입력받은 시간을 "시:분" 형식으로 출력한다.
 */
public class CodeUp1018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String time = scanner.next();
        String[] t = time.split(":");
        System.out.println(t[0] + ":" + t[1]);
    }
}
