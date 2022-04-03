package com.algorithm.example.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * 설명
 * A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
 * 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
 * 예를 들어 N=5이면
 * 두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.
 * 두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.
 * 세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.
 *
 * 출력
 * 각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.
 *
 * 예시 입력 1
 * 5
 * 2 3 3 1 3
 * 1 1 2 2 3
 * 예시 출력 1
 * A
 * B
 * A
 * B
 * D
 */
public class RockPaperScissors {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int gameCount = sc.nextInt();
    int[] aArr = new int[gameCount];
    int[] bArr = new int[gameCount];

    for (int i = 0; i < gameCount; i++) {
      aArr[i] = sc.nextInt();
    }

    for (int i = 0; i < gameCount; i++) {
      bArr[i] = sc.nextInt();
    }

    solution(gameCount, aArr, bArr);
  }

  // 1 가위 2 바위 3 보
  private static void solution(int gameCount, int[] aArr, int[] bArr) {
    List<String> winners = new ArrayList<>();

    for (int i = 0; i < gameCount; i++) {
      int minus = aArr[i] - bArr[i];
      if (aArr[i] == bArr[i]) {
        winners.add("D");
      } else if (minus == 1 || minus == -2) {
        winners.add("A");
      } else {
        winners.add("B");
      }
    }
    winners.forEach(System.out::println);
  }
}
