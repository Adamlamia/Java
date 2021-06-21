package linkedlist;

public interface LinkedListInterface<E> {

    public void addFirst(E e);

    public void add(int index, E e);
    
    public void addLast(E e);

    public E getFirst();

    public E getLast();

    public E removeFirst();

    public E remove (int index);

    public E removeLast();
    
}
