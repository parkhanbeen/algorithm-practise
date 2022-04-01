package com.algorithm.example.string;

import java.util.Scanner;

/**
 * 설명
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
 *
 * 출력
 * 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
 *
 * 예시 입력 1
 * a#b!GE*T@S
 *
 * 예시 출력 1
 * S#T!EG*b@a
 */
public class FlipSpecificCharacters {

  private static String solution(String characters) {
    int left = 0;
    int right = characters.length() - 1;

    char[] characterArr = characters.toCharArray();
    while (left < right) {
      if (isAlphabet(characterArr[left]) && isAlphabet(characterArr[right])) {
        char temp = characterArr[left];
        characterArr[left] = characterArr[right];
        characterArr[right] = temp;
        left++;
        right--;
      } else {
        if (!isAlphabet(characterArr[left])) {
          left++;
        }
        if (!isAlphabet(characterArr[right])) {
          right--;
        }
      }
    }
    return String.valueOf(characterArr);
  }

  private static boolean isAlphabet(char c) {
    return ((c >= 65 && c <= 90) || (c >= 97 && c <= 122));
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String characters = sc.next();

    System.out.println(solution(characters));

  }
}
