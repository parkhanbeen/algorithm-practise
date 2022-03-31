package com.algorithm.example.string;

import java.util.Scanner;

/**
 * 설명.
 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
 *
 * 입력.
 * 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
 * 문자열은 영어 알파벳으로만 구성되어 있습니다.
 *
 * 출력 StuDY -> sTUdy
 */
public class CaseConversion {

  public static String solution(String content) {
    StringBuilder result = new StringBuilder();

    for (char c : content.toCharArray()) {
      if (Character.isUpperCase(c)) {
        result.append(Character.toLowerCase(c));
      } else {
        result.append(Character.toUpperCase(c));
      }
    }
    return result.toString();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String content = sc.next();

    System.out.println(solution(content));
  }
}
