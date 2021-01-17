package com.algorithm.codeup.basic.codeup100;

import java.util.Scanner;

/**
 * 입력 : 같은 날 동시에 가입한 인원 3명이 규칙적으로 방문하는,
 * 방문 주기가 공백을 두고 입력된다. (단, 입력값은 100이하의 자연수이다.)
 *
 * 출력 : 3명이 다시 모두 함께 방문해 문제를 풀어보는 날(동시 가입/등업 후 며칠 후?)을 출력한다.
 */
public class CodeUp1092 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int day = 1;

        while(day % a !=0 || day % b != 0 || day % c != 0) {
            day++;
        }
        System.out.println(day);


    }
}


