package com.algorithm.example.array;

import java.util.Scanner;

/**
 * 설명
 * 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
 * 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
 *
 * 입력
 * 첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
 *
 * 출력
 * 첫 줄에 소수의 개수를 출력합니다.
 *
 * 예시 입력 1
 * 20
 * 예시 출력 1
 * 8
 */
public class PrimeNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    System.out.println(solution(number));
  }

  private static int solution(int number) {
    int primeNumberCount = 0;
    int[] primeNumbers = new int[number + 1];

    for (int i = 2; i <= number; i++) {
      if (primeNumbers[i] == 0) {
        primeNumberCount++;
        for (int j = i; j <= number; j = j + i) {
          primeNumbers[j] = 1;
        }
      }
    }
    return primeNumberCount;
  }
}
