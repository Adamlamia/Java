import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        /*loop are consist of ICU
         * initialization
         * comparison
         * update
         */

         int i = 0; //initialization
         while (i < 10) { //comparison
             System.out.println("iteration = " + i);
            i++; //update
         }

         Scanner scan = new Scanner(System.in);

         System.out.println("Enter the password");
         String password = "let me in";
         String inputUser = scan.nextLine();

         while (inputUser.equals(password) == false) { //the condition can also written as (!inputUser.equals(password))
             System.out.println("wrong pass bitch");
             inputUser = scan.nextLine();
         }

         System.out.println("Come in bro");
         scan.close();

         /*nested while loop
         *let's make some pyramid
         * 
         * 
         */
         int j = 0;
         
         while (j < 10) {
             int k = j;
             while (k < 10) {
                 System.out.print("*");
                 k++;
            }
             System.out.print("\n");
             j++;
         }
    }
}
