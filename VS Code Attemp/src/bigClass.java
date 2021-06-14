public class bigClass {
    public static void main(String[] args) {
        //for class smalClass_1
        smallClass_1 user_1 = new smallClass_1();
        user_1.firstName = "Adam";
        user_1.lastName = "Lamia";
        System.out.println(user_1.fullName());

        //for smallClass_2
        smallClass_2 user_2 = new smallClass_2();
        user_2.firstName = "Nurul";
        user_2.lastName = "Asyikin";
        System.out.println(user_2.fullName());

    }
}
