package linkedlist;

public class MyLinkedList<E> implements LinkedListInterface<E> {

    private class Node<T> {
        private T element;
        private Node<T> next = null;

        public Node(T element) {
            this.next = null;
            this.element = element;
        }
    }

    private Node<E> head, tail;
    private int size;

    @Override
    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);

        if (head == null) {
            head = tail;
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;//new node are now the head
        }
        size++;
    }

    @Override
    public void addLast(E e) {
        Node<E> newNode = new Node<>(e);

        if (tail == null) {
            tail = head;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;//new node are now the tail
        }
        size++;
    }

    @Override
    public E getFirst() {
        return head.element;
    }

    @Override
    public E getLast() {
        return tail.element;
    }

    @Override
    public E removeFirst() {
        if (size == 0) {
            return null;
        } else {
            Node<E> temp = head;

            head = head.next;
            size--;

            return temp.element;
        }
    }

    @Override
    public E removeLast() {
        if (size == 0) {
            return null;
        } else if (size == 1) {
            Node<E> temp = head;
            head = tail;
            head = null;
            size--;
            return temp.element;
        } else {
            Node<E> temp = tail;
            Node<E> current = head;

            for (int i = 0; i < size - 2; i++) {
                current = current.next;
            }
            tail = current;
            tail.next = null;
            size--;

            return temp.element;
        }
    }

}