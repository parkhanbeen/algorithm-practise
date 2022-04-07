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
public class GridMaxSum {
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
    int max = 0;
    int tmp1 = 0;

    for (int i = 0; i < grid.length; i++) {
      int tmp = 0;

      tmp1 += grid[i][i];

      for (int j = 0; j < grid.length; j++) {
        tmp += grid[i][j];
      }

      if (max < tmp) {
        max = tmp;
      }
      if (max < tmp1) {
        max = tmp1;
      }
    }

    for (int j = 0; j < grid.length; j++) {
      int tmp = 0;
      for (int i = 0; i < grid.length; i++) {
        tmp += grid[i][j];
      }
      if (max < tmp) {
        max = tmp;
      }
    }

    int tmpClos = 0;
    for (int i = 0; i < grid.length; i++) {
      int size = grid.length - 1;
      tmpClos += grid[size][i];
    }

    if (max < tmpClos) {
      max = tmpClos;
    }
    return max;
  }
}
