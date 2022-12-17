// java program to convert decimal to octal

import java.util.*;
public class ConvDec2Oct {
  
  public static void main(String args[]) {
    int num, counter = 0;
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter any integer number: ");
    num = sc.nextInt();

    //to store maximum 32 digits
    int octalVal[] = new int[32];

    while (num > 0) {
      octalVal[counter++] = num % 8;
      num = num / 8;
    }

    /*print octal values stored in octalVal*/
    for (int i = counter - 1; i >= 0; i--) {
      System.out.print(octalVal[i]);
    }
  }
}