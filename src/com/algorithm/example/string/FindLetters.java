package com.algorithm.example.string;

import java.util.Scanner;

public class FindLetters {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String letters = sc.nextLine();
    String findLetters = sc.next();

    String upperCaseLetters = letters.toUpperCase();
    String upperCaseFindLetters = findLetters.toUpperCase();

    char[] upperCaseLettersArr = upperCaseLetters.toCharArray();

    char findChar = upperCaseFindLetters.charAt(0);

    int count = 0;
    for (char c : upperCaseLettersArr) {
      if (findChar == c) {
        count++;
      }
    }

    System.out.println(count);

  }
}
