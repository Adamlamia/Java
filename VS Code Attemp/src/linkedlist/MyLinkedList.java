package linkedlist;

public class MyLinkedList<E> implements LinkedListInterface<E> {
    
    private Node<E> head, tail;
    private int size;

    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();

        list.addFirst("Nice");
        list.addLast("Place");
        //list.addLast("Innit");
        //list.addLast("?");
        //list.addFirst("What");
        //list.addFirst("A");

        MyLinkedList<String>.Node<String> current = list.head;

        while (current != null) {
            System.out.println(current.element);
            current = current.next;
        }
    }

    private class Node<E> {
        private E element;
        private Node<E> next = null;

        public Node(E element) {
            this.next = null;
            this.element = element;
        }
    }

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

	@Override
	public void add(int index, E e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

}