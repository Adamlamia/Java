import java.util.Arrays;

public class dataType {
    public static void main(String[] args) {
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
        System.out.println(Arrays.toString(numberUp)); //print the whole array in order
        System.out.println(numberUp[0]); //lowest number in array
        System.out.println(numberUp[numberUp.length - 1]); //highest number in array
        
        //descending number [barba]
        int[] numberDown = {3, 9, 1, 5, 7, 6};
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
        System.out.println(Arrays.toString(numberDown)); //print the whole array in order
        System.out.println(numberDown[0]); //lowest number in array
        System.out.println(numberDown[numberDown.length - 1]); //highest number in array
        //[library = bad]
        System.out.println(Integer.MIN_VALUE); //printout minimun value
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Double.MAX_VALUE); 
        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println(Double.NEGATIVE_INFINITY);
        System.out.println(Double.NaN); //example below
        System.out.println(Math.sqrt(-1)); //meaning = not a number
        System.out.println(Double.isNaN(Math.sqrt(-1))); // the first layer is to a boolean funtion
        
    }
}
