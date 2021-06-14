public class breakVsContinue {
    public static void main(String[] args) {
        //break
        //everytime inner loop reached 5 it will exit the inner loop
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                if (j == 5) {
                    break; //stop doing only one nearest loop
                }
                System.out.print(j);
            }
            System.out.println("");
        }

        System.out.println();
        //continue
        //everytime inner loop reached 5 it will skip from printing "5"
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                if (j == 5) {
                    continue; //skip only one things
                }
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
