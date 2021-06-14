package linkedlist;
public class linkedlist<E> {
    E element; //contain the element
    linkedlist<E> next; //reference to the next nodes

    private Node<E> head, tail;

    public linkedlist(E obj) {
        element = obj;
    }

    public static void main(String[] args) {
        linkedlist<String> head = null;
        linkedlist<String> tail = null;
        linkedlist<String> current = head;

        head = new linkedlist<String>("Dick");
        tail = head;

        //you can write as this
        tail.next = new linkedlist<String>("Shit");
        tail = tail.next; 

        //or you can write like this
        tail = new linkedlist<String>("Head");
        head.next = tail;

        while (current != null) {
            System.out.println(current.element);
            current = current.next;
        }
    }

    private static class Node<E> {
        
    }
}
