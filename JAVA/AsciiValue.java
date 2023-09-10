// Given a character, you need to print the ASCII value of that character.

import java.util.Scanner;

public class AsciiValue {

  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
      char a = s.next().charAt(0);
      int i = a;

      System.out.println(i);
    }
  }
}
