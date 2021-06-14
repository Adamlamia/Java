import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*practicing using binary search to find various primitif integer
        *the simplest and most efficient way to find element in sorted array in Java
        *
        *public static int binarySearch(dataType arr, dataType key) {}
        *                                  array^       toFind^
        */
        //int search [library = bad]
        int[] integer = {2, 6, 4, 5, 9};
        System.out.println("At index " + Arrays.binarySearch(integer, 9));

        //double search [library = bad]
        double[] doubt = {2.2, 6.5, 92.1, 33.1, 67};
        System.out.println("At index " + Arrays.binarySearch(doubt, 92.1));

        //barba
        int[] sortArray = new int[100];
        System.out.println("What number to find");
        int find = scan.nextInt();
        for (int i = 0, k = 1; i < sortArray.length; i++) {
            sortArray[i] = k++;
        }
        //split an aray into even or odd number
        if (sortArray.length % 2 == 0) { //for even number of element 
            if (sortArray[sortArray.length / 2] > find ) { //greater than find
                for (int i = 0; i < sortArray.length / 2; i++) { 
                    if (sortArray[i] == find) {
                        System.out.println(find + " found at index " + i);
                    }
                }
            } else { //smaller than find
                for (int i = sortArray.length / 2 + 1; i < sortArray.length; i++) {
                    if (sortArray[i] == find) {
                        System.out.println(find + " found at index " + i);
                    }
                }
            } 
        } else { //for odd number of element
            if (sortArray[sortArray.length / 2] > find) { //greater than find
                for (int i = 0; i < sortArray.length / 2; i++) {
                    if (sortArray[i] == find) {
                        System.out.println(find + " found at index " + i);
                    }
                }
            } else if (sortArray[sortArray.length / 2] == find) { //equals to middle
                System.out.println(find + " found at index " + sortArray.length / 2);
            } else { //smaller than find
                for (int i = sortArray.length / 2 + 1; i < sortArray.length; i++) {
                    if (sortArray[i] == find) {
                        System.out.println(find + " found at index " + i);
                    }
                }
            }
        }
        
        //true binary search
        int index = biSearch(sortArray, find);
        System.out.println(find + " found in index " + index);
        
        scan.close();
    }
    public static int biSearch(int[] array, int key) {
        int i = 0; //counting index
        int arrayLength = array.length - 1;
        while (i <= arrayLength) {
            int m = (i + arrayLength) / 2;

            if (array[m] == key) 
                return m;
            
            else if (array[m] < key) 
                i = m + 1;

            else 
                arrayLength = m - 1;
        }
        return -1;
    }
}
