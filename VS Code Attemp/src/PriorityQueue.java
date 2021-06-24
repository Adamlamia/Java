import java.util.LinkedList;
//import java.util.PriorityQueue;

public class PriorityQueue<E> {
    private LinkedList<E> list = new LinkedList<>();

    public boolean offer(E e) {
        
        
        return true;
    }

    public boolean remove(Object o) {
        if (list.isEmpty()) {
            return false;
        }
        
        return true;
    }

    public E peek(){
        return list.peekFirst();
    }

    public E poll(){
        return list.getFirst();
    }

    public void clear(){

    }

    public int size(){
        return list.size();
    }

    public boolean contains (Object o){
        if (list.isEmpty()) {

            return false;
        }
        return true;
    }
}
