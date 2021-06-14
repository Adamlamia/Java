package Test17202726;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your code here: ");
        String code = scan.nextLine();
        System.out.println(topUp(code));
    }

    public static String topUp(String code) {
        //Split string into array to count asterisk
        String[] arr = code.split("");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals("*")) count++;
        }

        //Base case
        if(count%2!=0) {
            System.out.println("Please put the digits between two stars");
            Scanner scan = new Scanner(System.in);
            String newline = scan.nextLine();
            return topUp(newline);
        }
        //if the input is not plaaced between 2 *
        if(!arr[0].equals("*") || !arr[arr.length-1].equals("*")){ //code to check
            System.out.println("Please put the digits between two stars");
            Scanner in = new Scanner(System.in);
            String newline = in.nextLine();
            return topUp(newline);
        }
        return "Correct";
    }
}
