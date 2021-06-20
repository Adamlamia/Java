package linkedlist;

public class linkedlist<E> {
    private E element; //contain the element
    private linkedlist<E> next; //reference to the next nodes

    public linkedlist(E obj) {
        this.element = obj;
    }

    public static void main(String[] args) {
        linkedlist<String> head = null;
        linkedlist<String> tail = null;
        
        head = new linkedlist<String>("Dick");
        tail = head;
        
        //you can write as this
        tail.next = new linkedlist<String>("Shit");
        tail = tail.next; 
        
        //or you can write like this, not recommended
        tail = new linkedlist<String>("Head");
        head.next = tail;
        
        linkedlist<String> current = head;
        
        while (current != null) {
            System.out.println(current.element);
            current = current.next;
        }
    }

    private static class Node<E> {
        
    }
}
