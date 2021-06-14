import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] arg) {
        //[library]
        int[] numberDown = {3, 9, 1, 5, 7, 6};

        Arrays.sort(numberDown);
        System.out.println(Arrays.toString(numberDown)); //use Arrays.parakkerSirt for larger array

        //descending number [barba]
        
        for (int i = 0; i < numberDown.length; i++) {
            for (int j = 0; j < numberDown.length - 1; j++) {
                if (numberDown[j] < numberDown[j + 1]) {
                    int tempNum = numberDown[j];
                    numberDown[j] = numberDown[j + 1];
                    numberDown[j + 1] = tempNum;
                } else {
                    continue;
                }
            }
        }
        System.out.println(Arrays.toString(numberDown));

        //ascending number [barba]
        int[] numberUp = {3, 9, 1, 5, 7, 6};
        for (int i = 0; i < numberUp.length; i++) {
            for (int j = 0; j < numberUp.length - 1; j++) {
                if (numberUp[j] > numberUp[j + 1]) {
                    int tempNum = numberUp[j];
                    numberUp[j] = numberUp[j + 1];
                    numberUp[j + 1] = tempNum;
                } else {
                    continue;
                }
            }
        }
        System.out.println(Arrays.toString(numberUp));
    }
}
