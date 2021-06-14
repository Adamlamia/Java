import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstName = scan.nextLine();
        System.out.println("Enter last name:");
        String lastName = scan.nextLine();
        System.out.println(firstName + " " +lastName);
        
        scan.close();
    }
}
    