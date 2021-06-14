import java.util.Scanner;

public class stringDataType {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //String is not a perimitive, it's an instance class
        //similar to Double, Integer
        //this 2 do the same shit
        String x = "Hello";
        String y = new String("Hello");
        System.out.println(x + y); //nothing change to x and y

        System.out.println(x.charAt(1)); //print out the index 1 of string x

        System.out.println(x.length()); //show the number of letters in x
        
        //This two are same shit
        String s = " to every peasant in this world";
        System.out.println(x + s);
        System.out.println(x.concat(s));
        System.out.println(s.contains("eve")); // checking if the wanted sequent of letters are present
        System.out.println(s.indexOf("pea", 3)); //to look at whiuch index the workds start, start searching after 3 index
        System.out.println(s.lastIndexOf("pea")); //start from left
        System.out.println(s.toUpperCase()); //to print string s in uppercase >> s.toLowerCase is for lowercase
        System.out.println(s.strip()); // to get rid of extra space including tabs and new line
        System.out.println(s.substring(9)); //print only after index 9 (after, before)
        System.out.println(s.repeat(3));
        System.out.println(s.equals("to every")); //will compare the object to be similar or not to s string
        //.equal can be use for security to enter password 
        //this is the example
        String password = "let me in bitch";
        System.out.println("What's the password bitch");
        String inputpass = scan.nextLine();
        
        if(password.equals(inputpass)){
            System.out.println("You're in");
        } else {
            System.out.println("Fuck off");
        }
        
        scan.close();
    }
}
