public class searchArrayForLoop {
    public static void main(String[] args) {
        int[] random = {3, 6, 9, 12, 15};
        //find an integer in an array
        for (int i = 0; i < random.length; i++) {
            if (random[i] == 12) {
                System.out.println("Found it at index " + i);
            }
        }
    }
}
