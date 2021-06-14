public class label {
    public static void main(String[] args) {
        /*Label statement used to label the loop statement
        *used by break statement and continue statement
        */

        //label break statement
    first:
         for (int i = 0; i < 3; i++) { //this is the loop labeled as "first"
            for (int j = 0; j < 3; j++){
                 if(i == 1){
                    continue first;
                }
            System.out.print(" [i = " + i + ", j = " + j + "] ");
            }
        }
         System.out.println();
     
    second:
        for (int i = 0; i < 3; i++) { //this is the loop labeled as "second"
            for (int j = 0; j < 3; j++){
                if(i == 1){
                    break second;
                }
            System.out.print(" [i = " + i + ", j = " + j + "] ");
            }
        }
    }
}
