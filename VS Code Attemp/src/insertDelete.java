import java.util.Scanner;

public class insertDelete {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] whore_1 = {1, 2, 3, 4, 5};
        int[] whore_2 = new int[whore_1.length + 1];
        int[] whore_3 = new int[whore_1.length + 1];
        int[] whore_4 = new int[whore_3.length - 1];
         //adding a new number at the end of an array
         for (int i = 0; i < whore_1.length; i++) {
             whore_2[i] = whore_1[i];
         }
         whore_2[whore_1.length] = 6; 
         for (int i = 0; i < whore_2.length; i++) {
             System.out.print(whore_2[i] + " ");
         }
         System.out.println();
         //adding a new number at wherever wanted in a array
         System.out.println("Add a number? Where?");
         int whereIn = scan.nextInt();
         System.out.println("What num?");
         int whatIn = scan.nextInt();
        
        for (int i = 0, j = 0; i < whore_4.length; i++) {
            if (i == whereIn - 1) {
                whore_3[whereIn - 1] = whatIn;
                j++;
            }
            whore_3[j++] = whore_1[i];
        }
        for (int i = 0; i < whore_3.length; i++) {
            System.out.print(whore_3[i] + " ");
        }
        System.out.println();
        
        //delete an number from array
         System.out.println("Remove a number? Where?");
         int whereOut = scan.nextInt();

        for (int j = 0, k = 0 ; j < whore_4.length; j++) {
            if (j == whereOut - 1) {
                k++;
            }
            whore_4[j] = whore_3[k++];
        }
        for (int i = 0; i < whore_4.length; i++) {
            System.out.print(whore_4[i] + " ");
        }
        
        scan.close();
    }
}
