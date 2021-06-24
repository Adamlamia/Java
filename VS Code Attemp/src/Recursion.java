import java.io.File;
import java.util.Scanner;

public class Recursion {
    /**Recursion consist of 2 type of cases
     * One or more base cases used to stop the recursion
     * Resursion case used to call every  recursion until it become base case
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(fibonacci(6));
        recursion(1532);
        System.out.println("\nEnter the directory");
        Scanner scan = new Scanner(System.in);
        String directory = scan.nextLine();
        System.out.println(directorySize(new File(directory)) + "bytes");
    }

    public static int factorial(int num){
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    public static int fibonacci(int index){
        if (index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else {
            return fibonacci(index - 1) + fibonacci(index - 2);
        }
    }

    public static void recursion(int n){ //print the number backward
        if (n > 0) { //this is the recursion case
            System.out.print(n%10);
            recursion(n / 10);
        }
        //base case is when n < 0
    }

    public static int directorySize(File file){
        int size = 0;
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; files != null && i < files.length; i++) {
                size += directorySize(files[i]);
            }
        } else {
            size += file.length();
        }
        return size;
    }
}
