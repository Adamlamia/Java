package Test17202726;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        //recursion for recur
        arr = recur(arr, 5);

        //printing out the array of integers
        System.out.println("The array of integers is: ");
        for (int i : arr)
            System.out.print(i + " ");

        System.out.println();
    }

    public static int[] recur(int[] arr, int length) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        try {
            int in = scan.nextInt();
            arr[arr.length - length] = in;
            return recur(arr, length - 1);
        } catch (InputMismatchException notInteger) {
            //if input != integer
            System.out.println("Invalid integer type!");
            return recur(arr, length);
        } catch (ArrayIndexOutOfBoundsException outOfBound) {
            //if input has exceedeed
            return arr;
        }
    }
}
