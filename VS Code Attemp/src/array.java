import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int[] grade = new int[10]; //to set an array with 10 unregisteres index
        grade[0] = 10;
        System.out.println(grade[0]);
        
        int[] mark_1 = {10, 3, 5, 6}; //to set an array of n registered index
        mark_1[0] += 1;
        System.out.println(mark_1[0]);
        int[][] mark_2 = {{1, 2, 3, 4}, {5, 6, 7, 8, 9}, {10, 22, 33}};

        //to print an array [library = good maybe]
        System.out.println(Arrays.toString(mark_1)); //only for single dimentional array
        System.out.println(Arrays.deepToString(mark_2)); //for 2 dimentional array
        //to print an array [barba]
        for (int i = 0; i < mark_1.length; i++) { //1-D Array
            System.out.print(mark_1[i]);
        }
        System.out.println();
        for (int i = 0; i < mark_2.length; i++) { //2-D Array
            for (int j = 0; j < mark_2.length; j++) {
                System.out.print(mark_2[i][j]);
            }
            System.out.println();
        }
        for (int is : mark_1) { //This is for 1-D array 
            System.out.print(is + " ");
        }
        System.out.println(); //This is for 2-D Array
        for (int[] row : mark_2) {
            if (row != null) 
                for (int column : row) 
                    System.out.print(column + " ");
            System.out.println();                
        }
        //uninitialized array
        int[] random = new int[10];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < random.length; i++) {
            random[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(random));

        //to compare if two array have the same element
        int[] arr_1 = {1, 2, 3, 4, 5};
        int[] arr_2 = {1, 2, 3, 4, 5};
        int[] arr_3 = {5, 4, 3, 2, 1};

        if (Arrays.equals(arr_1 ,arr_2))
            System.out.println("arr_1 == arr_2");
        
        if (Arrays.equals(arr_1 ,arr_3))
            System.out.println("arr_1 == arr_3");
        else
            System.out.println("arr_1 != arr_3");

        //to fill all elements in an array with the same value
        int[] arr_4 = new int[10];
        Arrays.fill(arr_4, 15);

        System.out.println(Arrays.toString(arr_4));

        scan.close();
    }
}
