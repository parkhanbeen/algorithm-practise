package com.algorithm.example.string;

import java.util.Scanner;

/**
 * 설명
 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
 * 문자열의 길이는 100을 넘지 않는다.
 *
 * 출력
 * 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
 *
 * 예시 입력 1
 * teachermode e
 * 예시 출력 1
 * 1 0 1 2 1 0 1 2 2 1 0
 */
public class ShortestCharacterDistance {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String content = sc.nextLine();
    for (int s : solution(content)) {
      System.out.print(s + " ");
    }
  }

  private static int[] solution(String content) {
    String[] s = content.split(" ");
    String contents = s[0];
    char findKeyword = s[1].charAt(0);
    int[] numberIndex = new int[contents.length()];
    int p = 100;

    for (int i = 0; i < contents.length(); i++) {
      if (findKeyword == contents.charAt(i)) {
        p = 0;
      } else {
        p++;
      }
      numberIndex[i] = p;
    }

    p = 100;
    for (int i = contents.length() - 1; i >= 0; i--) {
      if (findKeyword == contents.charAt(i)) {
        p = 0;
      } else {
        p++;
      }
      numberIndex[i] = Math.min(numberIndex[i], p);
    }

    return numberIndex;
  }
}
