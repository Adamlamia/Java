import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        //usually used to search in a small array
        int[] array = {3, 6, 9, 4, 5, 2, 12, 55, 6, 1};
        int find = scan.nextInt();
        int i;
        scan.close();
        //how to make if find not in array to print fuck off
        for (i = 0; i < array.length; i++) {
            if (array[i] == find) {
                System.out.println(find + " found at index " + i);
                break;
            } 
        }
        if (i == array.length) {
            System.out.println("Not found");
        }
        scan.close();
        
        int index = lSearch(array, find);
        System.out.println("Find is found at " + index);

    }
    public static int lSearch(int[] array,int find) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == find) {
                return i;
            }
        }
        return -1;
    }
}
