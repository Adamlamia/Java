import java.io.*;

public class writeToTextFile {
    public static void main(String[] args) throws IOException {
        File file = new File("testFile.txt"); //creating a file name "testFile" and a file object named "file". If it never exist.
        FileWriter fileWrite = new FileWriter(file, true); //"true" this will add to the new line instead of overwrite
        PrintWriter write1 = new PrintWriter(new FileOutputStream(file, true));
        PrintWriter write2 = new PrintWriter(fileWrite);

        //the testFile.txt will write write1 first unless boolean writer is true
        write1.println("Ey yoo wat sup");
        write1.println("I'm a dumb motherfucker");
        
        //write2 will overwrite the text from write1 unless boolean writer is true
        write2.println("2021 still shit");
        write2.println("But my life is still shittier");

        write1.close();
        write2.close();
    }
}