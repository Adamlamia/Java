public class inheritTest {
    public static void main(String[] args) {
        //object Dad created by invoking inheritDad constructor
        inheritParent Dad = new inheritParent("Samsuhaimi", "Fishing", "Average", "Average", "Super");
        //object Son1 created by invoking inheritChild constructor who inherit inheritDad constructor
        inheritChild Son1 = new inheritChild("Adam", "Computer Skill", "Above average", "Average", "Super", "Anime");
        //object Grandson1 created by invoking inheritGrandchild 
        inheritGrandchild Granddaughter1 = new inheritGrandchild("Anastasia", "Creative", "Average", "Light", "Super", "Arts", "Painting");

        System.out.println(Dad.toString()); //will be printout without interest & hobby
        System.out.println(Son1.toString()); //will be printout with interest, but without hobby
        System.out.println(Granddaughter1.toString()); //wil printout with interest & hobby
        
        //object can access methods from any class regarless inheritance
        Dad.iam();
        System.out.println();
        
        Son1.iam();
        System.out.println();

        Granddaughter1.iam();
        System.out.println();

        //to show which class object comes from
        System.out.println(Dad.getClass());
        System.out.println(Son1.getClass());
        System.out.println(Granddaughter1.getClass());

        //questioning if Dad from class inheritParent
        if (Dad instanceof inheritParent) {
            System.out.println("yes");
        }
    }
}
