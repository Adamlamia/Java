import java.util.Arrays;

public class twoDArray {
    public static void main(String[] args) {
        int[][] numbers = {
            {2, 5, 9, 6},
            {1, 2, 54, 42, 33, 1, 51, 12, 6},
            {9, 5, 6, 2, 2, 22, 78}
        };
        //[library]
        System.out.println(Arrays.deepToString(numbers));

        //[barba]
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
