import java.io.*;

public class writeReadToBinaryFile {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream("test.dat"));
        //
        write.writeInt(420);
        write.writeDouble(69);

        write.close();

        ObjectInputStream read = new ObjectInputStream(new FileInputStream("test.dat"));

        int i = read.readInt();
        double d = read.readDouble();

        System.out.println(i + " " + d);
        
        read.close();
    }
}
