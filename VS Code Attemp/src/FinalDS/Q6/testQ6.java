package FinalDS.Q6;

import java.util.Random;

public class testQ6 {
    static void shuffleArray(int[] ar) {
        // If running on Java 6 or older, use `new Random()` on RHS here
        Random r = new Random();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = r.nextInt(i + 1);
            // Simple swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }

    public static void main(String[] args) {
        Random r = new Random();
        int[] Tag = new int[1000];

        for (int i = 0; i < 1000; i++)
            Tag[i] = i;

        shuffleArray(Tag);

        String res1 = linearSearch(Tag, 420, 15);
        System.out.println(res1);


        int[] temp = new int[1000];
        System.arraycopy(Tag, 0, temp, 0, 1000);

        //selection sort
        int[][] sort1 = selectionSort(Tag, 6);
        int[] sortTag1 = sort1[0];
        double time1 = (double) sort1[1][0] / 60;

        //bubble sort
        int[][] sort2 = bubbleSort(temp, 6);
        int[] sortedTags2 = sort2[0];
        double time2 = (double) sort2[1][0] / 60;

        String result2 = binarySearch(sortTag1, 420, 15, time1);
        String result3 = binarySearch(sortedTags2, 420, 15, time2);
        System.out.println("Selection sorted: "+ result2);
        //System.out.println("Bubble sorted: "+ result2);


        //comparing efficiency
        double t1 = Double.parseDouble(res1.substring(res1.indexOf("(") + 1, res1.indexOf(")")));
        double t2 = Double.parseDouble(result2.substring(result2.indexOf("(") + 1, result2.indexOf(")")));
        double t3 = Double.parseDouble(result3.substring(result3.indexOf("(") + 1, result3.indexOf(")")));

        double eff1 = t2/t1 *100;
        System.out.println("Efficiency: "+eff1+"%");

    }

    public static String linearSearch(int[] tags, int key, int delayPerSearch) {
        int pos = 0;
        boolean found = false;
        for (int i = 0; i < tags.length; i++) {
            if (tags[i] == key) {
                pos = i;
                found = true;
                break;
            }
        }

        if (found) {
            double delayMinute = (double) (pos * delayPerSearch) / 60;
            return "Using Linear Search: Found " + key + " at position: " + pos + " (" + delayMinute + ") minutes";
        } else
            return "Not found";
    }

    public static int[][] selectionSort(int[] tags, int timePerSwap) {
        int len = tags.length;
        int swaps = 0;
        int[][] out = new int[2][len];

        for (int i = 0; i < len - 1; i++) {

            //FIND THE MINIMUM ELEMENT IN UNSORTED ARRAY
            int minimum_idx = i;
            for (int j = i + 1; j < len; j++) {
                if (tags[j] < tags[minimum_idx]) {
                    minimum_idx = j;
                }
            }

            //SWAPPING
            int temp = tags[minimum_idx];
            tags[minimum_idx] = tags[i];
            tags[i] = temp;
            swaps++;
        }

        System.arraycopy(tags, 0, out[0], 0, len);
        out[1][0] = timePerSwap * swaps;
        return out;
    }

    public static int[][] bubbleSort(int[] tags, int timePerSwap) {
        int len = tags.length, swaps = 0;
        int[][] out = new int[2][len];

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (tags[j] > tags[j + 1]) {
                    //SWAPPING
                    int temp = tags[j];
                    tags[j] = tags[j + 1];
                    tags[j + 1] = temp;
                    swaps++;
                }
            }
        }

        System.arraycopy(tags, 0, out[0], 0, len);
        out[1][0] = timePerSwap * swaps;
        return out;
    }

    public static String binarySearch(int[] tags, int key, int delayPerSearch, double swapTime) {
        //return: found index
        //return -1 if not found
        int first = 0, last = tags.length - 1, middle;
        int scans = 0; //number of scans
        int pos = 0; //position
        boolean found = false;

        do {
            middle = (first + last) / 2;
            scans++;
            if (tags[middle] < key) {
                first = middle + 1;
            } else if (tags[middle] == key) {
                pos = middle;
                found = true;
                break;
            } else {
                last = middle - 1;
            }

        } while (first <= last);

        if (found) {
            double retrievalTime = (double) (scans * delayPerSearch) / 60;
            return "Using Binary Search: Found " + key + " at position: " + pos + " (" + (retrievalTime + swapTime) + ") minutes";
        } else
            return "Not found!";
    }
}
