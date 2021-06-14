import java.io.*;
import java.util.Scanner;

public class readFromTextFile {
    public static void main(String[] args) throws IOException {
        //use Scanner class & BufferReader class

        Scanner read1 = new Scanner(new FileInputStream("testFile.txt")); //to read1 from a specified directory, put the whole path
        BufferedReader read2 = new BufferedReader(new FileReader("testFile.txt"));

        //scanner version
        while (read1.hasNextLine()) { //it will read1 till there is no new line
            String input1 = read1.nextLine();
            System.out.println(input1);
        }

        //buffered version
        String input2 = read2.readLine();
        while ((input2 = read2.readLine()) != null) {
            System.out.println(input2);   
        }
        
        
        
        read1.close();
        read2.close();
    }
}
