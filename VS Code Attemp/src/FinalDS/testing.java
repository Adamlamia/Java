package FinalDS;

public class testing <T extends Comparable<T>>{
    private T a;

    public testing(T p, T q){
        if (p.compareTo(q)>0)
            a = p;
        else
            a = q;
    }

    public T getA(){
        return a;
    }

    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        testing<Integer> run1 = new testing<>(x,y);
        System.out.println("Max is " + run1.getA());
        
        System.out.println(new testing("Hello", "World"));
    }
}
