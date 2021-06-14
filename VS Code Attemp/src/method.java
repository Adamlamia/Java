import java.util.Random;

public class method {
    public static void main(String[] args) {
        Random random = new Random();
        
        int divide = 2;
        int rand = random.nextInt(10);
        int[] shit = new int[10];

        // 1
        paste(shit, divide); //calling amethod from the same class

        // 2
        boolean nice = truth(shit, rand); //calling method from the same class
        System.out.println(nice);

        // 3         className     methodName
        int index = binarySearch.biSearch(shit, divide); //calling method from other class "binarySearch.java"
        System.out.println(divide + " found in index " + index);
        
    }
    // 1
    public static void paste(int[] arr, int divide) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i + 1) / divide;
            System.out.println(arr[i]);
        }
        return;
    }
    //2
    public static Boolean truth(int[] arr, int rand) {
        int set = 6;

        if (set == rand) {
            return true;
        } else {
            return false;
        }
    }
}
