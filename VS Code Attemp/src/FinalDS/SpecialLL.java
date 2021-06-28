package FinalDS;

import java.util.ArrayList;

public class SpecialLL<E> {
  Node<E> head, tail;
  int size = 0;

  public SpecialLL() {
  }

  public int getSize() {
    return size;
  }

  public void addFirst(E e) {
    Node<E> newNode = new Node<E>(e);
    newNode.next = head;
    head = newNode;
    size++;
    if (tail == null)
      tail = head;
  }

  public void addLast(E e) {
    Node<E> newNode = new Node<E>(e);
    if (tail == null) {
      head = tail = newNode;
    } else {
      tail.next = newNode;
      tail = tail.next;
    }
    size++;
  }

  public void print() {
    Node<E> current = head;
    for (int i = 0; i < size; i++) {
      System.out.print(current.element + " ");
      current = current.next;
    }
    System.out.println();
  }

  public void printOdd() {
    Node<E> current = head;
    while (current != null) {
      System.out.println(current.element + " ");
      current = current.next.next;
    }
  }

  public ArrayList<E> getEven() {
    ArrayList<E> even = new ArrayList<>();
        ArrayList<E> backward = new ArrayList<>();
        Node<E> current = head;
        while (current != null) {
            even.add(current.next.element);
            current = current.next.next;
        }

        for (int i = even.size() - 1; i >= 0; i--)
            backward.add(even.get(i));

        return backward;
    }
}
