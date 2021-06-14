import java.util.Scanner;

public class switchMethod {
    public static void main(String[] arg) {
        System.out.println("What's my name?");

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        switch (name.toLowerCase()) { //the string will be turned to lower case
            case "adam":
                System.out.println("Hai Adam");
                break;
            case "waiz":
                System.out.println("Fuck off");
                break;
            default:
                System.out.println("Who are you?");
                break;
        }
        // Cases where you don't want to put break; is when you want multiple cases to have the same command
        /*
        case "adam":
        case "waiz":
            sysout "fuck off";
        */
        String guy = "Adam";
        boolean welcome = guy.equals("Adam") ? true : false ; //true part can be other value if not boolean as well as false
        int shit = guy.equals("Adam") ? 5: 10;

        System.out.println(welcome);
        System.out.println(shit);
        
        scan.close();
    }
}
