import java.util.ArrayList;
import java.util.List;

public class arrayList {
    public static void main(String[] args) {
        //to make a array list variable
        List<Integer> grade = new ArrayList<Integer>();

        grade.add(5);
        grade.add(10);
        grade.add(1, 7); //will shift 10 in index 1 to index 2

        //to get value by asking index
        System.out.println(grade.get(0));
        System.out.println(grade.get(1));
        System.out.println(grade.get(2));

        //to get index by asaking value
        System.out.println(grade.indexOf(5));
        System.out.println(grade.indexOf(10));
        System.out.println(grade.indexOf(7));

        //to get boolean by asking value
        //can be used for case
        System.out.println(grade.contains(7));
        System.out.println(grade.contains(4));
        System.out.println(grade.contains(1));
        System.out.println(grade.contains(5));

        //to clear a list
        grade.clear();

        //tutorial 45
    }
}
