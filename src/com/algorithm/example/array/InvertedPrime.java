package com.algorithm.example.array;

import java.util.Scanner;

/**
 * 설명
 * N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
 * 예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
 * 첫 자리부터의 연속된 0은 무시한다.
 *
 * 입력
 * 첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
 * 각 자연수의 크기는 100,000를 넘지 않는다.
 *
 * 출력
 * 첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.
 *
 * 예시 입력 1
 * 9
 * 32 55 62 20 250 370 200 30 100
 * 예시 출력 1
 * 23 2 73 2 3
 */
public class InvertedPrime {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numberCount = sc.nextInt();
    int[] numbers = new int[numberCount];
    for (int i = 0; i < numberCount; i++) {
      numbers[i] = sc.nextInt();
    }

    System.out.println(solution(numbers));
  }

  private static String solution(int[] numbers) {
    String invertedPrime = "";
    int[] invertedNumbers = new int[numbers.length];

    // 숫자 거꾸로 만들기

    for (int i = 0; i < numbers.length; i++) {
      invertedNumbers[i] = Integer.parseInt(new StringBuilder(
          String.valueOf(numbers[i]))
          .reverse()
          .toString());
    }

    for (int i = 0; i < invertedNumbers.length; i++) {
      for (int j = 2; j < invertedNumbers[i]; j++) {
        if (invertedNumbers[i] % j == 0 && invertedNumbers[i] != 2) {
          invertedNumbers[i] = 0;
        }
      }
    }

    for (int i = 0; i < invertedNumbers.length; i++) {
      if (invertedNumbers[i] != 0 && invertedNumbers[i] != 1) {
        invertedPrime += invertedNumbers[i] + " ";
      }
    }

    return invertedPrime;
  }
}
