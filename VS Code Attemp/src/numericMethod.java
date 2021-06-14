public class numericMethod {
    public static void main(String[] args) {
        int x =10;
        int y = 100;
        System.out.println(Integer.max(x, y)); //compare which one is bigger number
        
        System.out.println(Integer.compare(x, y)); //if x < y == -1,x = y == 0, x > y == 1

        String money = "300";

        System.out.println(Integer.valueOf(money)); //convert string into integer value (object)
        System.out.println(Integer.parseInt(money)); //convert string into intefer value (parameter)
        
        /*from String money >> 
        * Integer moneyA = Integer.valueOf()
        *int moneyB = Integer.parseInt()
        */
    }
}
