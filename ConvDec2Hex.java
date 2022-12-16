// java program to convert decimal to hexadecimal

import java.util.*;

public class ConvDec2Hex {
  public static void main(String[] args) {

    int num, counter = 0;
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter any integer number: ");

    num = sc.nextInt();

    /* to store maximum 32 digits of a number */
    String hexVal = "";
    int digit; // to store digits
    while (num > 0) {
      digit = num % 16;
      switch (digit) {
        case 15:
          hexVal += "F";
          break;
        case 14:
          hexVal += "E";
          break;
        case 13:
          hexVal += "D";
          break;
        case 12:
          hexVal += "C";
          break;
        case 11:
          hexVal += "B";
          break;
        case 10:
          hexVal += "A";
          break;
        default:
          hexVal += Integer.toString(digit);
      }
      num = num / 16;
    }

    for (counter = hexVal.length() - 1; counter >= 0; counter--)
      System.out.print(hexVal.charAt(counter));
  }
}