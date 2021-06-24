import java.util.LinkedList;

public class Queue<E> {
    private LinkedList<E> list = new LinkedList<>(); //using linked list to make queue

    public void enqueue(E e) {
        list.addLast(e);
    }

    public void dequeue() {
        list.removeFirst();
    }

    public int getSize() {
        return list.size();
    }

    @Override
    public String toString() {
        return "Queue [list=" + list + "]";
    }
}
