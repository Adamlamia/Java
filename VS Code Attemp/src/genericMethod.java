public class genericMethod {
    //A generic method
    static <T> void genericDisplay (T elementT){
        System.out.println(elementT.getClass().getName() + " = " + elementT);
        /* .getClass()
        *it will fetch an input to determine what type of argument it is
        *then paired up with .getName()
        *it will fetch input to be determined by .getClass()
        */
    }
    //Driver method
    public static void main(String[] args) {
        genericDisplay(11);
        genericDisplay("GeeksForGeeks");
        genericDisplay(1.2);
    }
}
