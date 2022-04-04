package com.algorithm.example.array;

import java.util.Scanner;

/**
 * 설명
 * 1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
 * 2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
 *
 * 입력
 * 첫 줄에 총 항수 N(3<=N<=45)이 입력된다.
 *
 * 출력
 * 첫 줄에 피보나치 수열을 출력합니다.
 *
 * 예시 입력 1
 * 10
 * 예시 출력 1
 *
 * 1 1 2 3 5 8 13 21 34 55
 */
public class FibonacciSequence {

  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int indexSize = sc.nextInt();

  System.out.println(solution(indexSize));
  }

  private static String solution(int indexSize) {
    String result = "";

    int[] numbers = new int[indexSize];
    for (int i = 0; i < indexSize; i++) {
      if (i < 2) {
        numbers[i] = 1;
      } else {
        numbers[i] = numbers[i - 1] + numbers[i - 2];
      }
      result += numbers[i] + " ";
    }

    return result;
  }
}
