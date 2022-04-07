package com.algorithm.example.array;

import java.util.Scanner;

/**
 * 설명
 * 5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
 * N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
 *
 * 입력
 * 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
 * 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
 *
 * 출력
 * 최대합을 출력합니다.
 *
 * 예시 입력 1
 * 5
 * 10 13 10 12 15
 * 12 39 30 23 11
 * 11 25 50 53 15
 * 19 27 29 37 27
 * 19 13 30 13 19
 * 예시 출력 1
 * 155
 */
public class GridMaxSum2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();
    int[][] grid = new int[count][count];
    for (int i = 0; i < count; i++) {
      for (int j = 0; j < count; j++) {
        grid[i][j] = sc.nextInt();
      }
    }

    System.out.println(solution(grid));
  }

  private static int solution(int[][] grid) {
    int result = Integer.MIN_VALUE;
    int size = grid.length;
    int sum1;
    int sum2;

    // 행과 열의 합 구하기
    for (int i = 0; i < size; i++) {
      sum1 = 0;
      sum2 = 0;
      for (int j = 0; j < size; j++) {
        sum1 = grid[i][j];
        sum2 = grid[j][i];
      }
      result = Math.max(result, sum1);
      result = Math.max(result, sum2);
    }


    // 두 대각선의 합 구하기
    sum1 = 0;
    sum2 = 0;
    for (int i = 0; i < size; i++) {
      sum1 += grid[i][i];
      sum2 += grid[i][size - i - 1];
    }
    result = Math.max(result, sum1);
    result = Math.max(result, sum2);

    return result;
  }
}
