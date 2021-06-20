package linkedlist;

public class Node<E> {
    private E element;
    private Node<E> next = null;
    
    public Node(E element) {
        this.element = element;
    }
    
    public static void main(String[] args) {
        
        // this two are empty now
        Node<String> head = null;
        Node<String> tail = null;

        head = new Node<>("Chicago");
        tail = head;

        tail.next = new Node<>("Denver");
        tail = tail.next;
        tail.next = new Node<>("Dallas");
        tail = tail.next;
        tail.next = new Node<>("Alabama");
        tail = tail.next;

        Node<String> current = head;

        while (current != null) {
            System.out.println(current.element);
            current = current.next;
        }

    }
}
