import java.util.Scanner;

public class doWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputUser, password; //needs to be outside the loop else the condition can't be set
        do {
            System.out.println("what's the pass");
            password = "let me in";
            inputUser = scan.nextLine();
        } while (inputUser.equals(password) == false);
        scan.close();
    }
}
