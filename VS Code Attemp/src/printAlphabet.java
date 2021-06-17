public class printAlphabet {
    public static void main(String[] args) {
        char Alphabet = 'A'; //value of A is 65
        
        for (int i = 0; i < 26; i++) {
            //System.out.print((Alphabet + i));
            //System.out.print(Alphabet + i);
            System.out.print((char)(Alphabet + i));
            System.out.println();
        }
        
        for (int i = 33; i < 127; i++) {
            System.out.println("ASCII value of " + (char)i + " = " + i);
        }
    }
}
