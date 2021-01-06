package com.algorithm.codeup.basic.codeup70;

import java.util.Scanner;

/**
 * 입력 : 월을 의미하는 1개의 정수가 입력된다.(1 ~ 12)
 *
 * 출력 : 계절 이름을 출력한다.
 */
public class CodeUp1070 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        switch (a){
            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("fall");
                break;
            default:
                break;
        }
    }
}
