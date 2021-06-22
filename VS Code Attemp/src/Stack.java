import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<T> {
    private ArrayList<T> list;
    
    public static void main(String[] args) {
        Stack<Object> stack1 = new Stack<>();
        Stack<String> postfix = new Stack<>();
        
        stack1.push("Shit");
        stack1.push(1);
        stack1.push('A');
        stack1.push(1.53);
        System.out.println(stack1.toString());
        
        postfix.push("4");
    }

    public Stack() {
        list = new ArrayList<>();
    }
    
    public void push(T insert) {
        list.add(insert);
    }

    public T pop() {
        if (isEmpty()) // make boolean for this
            throw new EmptyStackException();

        T popped = list.get(getSize() - 1); // make getter for stack size
        list.remove(popped);

        return popped;
    }

    public T peek() {
        if (isEmpty())
            throw new EmptyStackException();

        return list.get(getSize() - 1);
    }

    public T get(int index) {
        return list.get(index - 1);
    }

    public int getSize() {
        return list.size();
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    @Override
    public String toString() {
        String output = "The Stack:\n";
        
        //Either this
        /*
        for (Object element : list.toArray()) {
            output += element + "\n";
        }

        return output;
        */

        //or this
        return output + list.toString();
    }

    public boolean search(T object) {
        return list.contains(object);
    }

}
