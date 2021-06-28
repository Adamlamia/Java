public class Sorting {
    public Sorting(){
    }
    public static void main(String[] args) {
        int[] list = {6, 1, 8, 22, 13, 9, 41, 8, 5, 4};
        insertionSort(list); //it start sorting the list into ascending order
        list.toString();
    }

    public static void insertionSort(int[] list){
        for (int i = 1; i < list.length; i++) {
            int currentE = list[i];
            int j;
            for (j = i - 1; j >= 0 && list[j] > currentE; j--) {
                list[j + 1] = list[j];
            }
            list[j + 1] = currentE;
        }
    }
/*
    @Override
    public String toString() {
        return "Sorting [" + list.toString() + "]";
    }
*/  
}
