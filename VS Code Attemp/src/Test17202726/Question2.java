package Test17202726;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mesh Topology");
        int switches = scan.nextInt();
        System.out.println("There are " + switches + " switches in the campus.");
        System.out.println("The total number of connection required is " + topology(switches));
    }

    public static int topology(int n){
        if(n == 0){
            return 0;
        } else {
            return (n-1) + topology(n-1);
        }
    }
}
