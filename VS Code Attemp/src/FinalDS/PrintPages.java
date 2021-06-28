package FinalDS;

import java.util.Scanner;
import java.util.ArrayList;

public class PrintPages {
   public static void main(String[] args) {
      SpecialLL<Integer> bookPage = new SpecialLL<>();
      ArrayList<Integer> selectedList = new ArrayList<>();
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the starting page: ");
      int start = input.nextInt();
      System.out.print("Enter number of pages: ");
      int page = input.nextInt();
      for (int i = 0; i < page; i++)
         bookPage.addLast(start + 0);
      selectedList=bookPage.getEven();

      int toPrintNum = start;

      if (toPrintNum % 2 == 0) { //if the start is even
         for (int i = 0; toPrintNum <= page; i++) {
            System.out.print(toPrintNum + " ");
            toPrintNum = toPrintNum + 2;
         }
         toPrintNum = start + 1;
         System.out.println();
         System.out.print(" ");
         for (int i = 0; toPrintNum <= page; i++) {
            System.out.print(toPrintNum + " ");
            toPrintNum = toPrintNum + 2;
         }
         
      }
      if (toPrintNum % 2 == 1) {
         for (int i = 0; toPrintNum <= page; i++) { //else the start is odd
            System.out.print(toPrintNum + " ");
            toPrintNum = toPrintNum + 2;
         }
         toPrintNum = start + 1;
         System.out.println();
         System.out.print(" ");
         for (int i = 0; toPrintNum <= page; i++) {
            System.out.print(toPrintNum + " ");
            toPrintNum = toPrintNum + 2;
         }
      }
   }
}
