package FinalDS.Q4;

import java.util.Collections;
import java.util.LinkedList;

public class priorityQueue<E extends Comparable<E>> {
    LinkedList<E> list;
    
    public priorityQueue(E[] e) {
        list = new LinkedList<>();
        for (int i = 0; i < e.length; i++) {
            list.add(e[i]);
        }
    }
    
    public priorityQueue() {
        list = new LinkedList<>();
    }
    
    public void enqueue(E e) {
        list.add(e);
        sortPriority();
    }
    
    public E dequeue() {
        return list.removeFirst();
    }
    
    public E getElement(int i) {
        return list.get(i);
    }
    
    public E peek() {
        return list.peek();
    }
    
    public int getSize() {
        return list.size();
    }
    
    public boolean contains(E e) {
        return list.contains(e);
    }
    
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
    public String toString() {
        return list.toString();
    }
    
    public void clear() {
        list.clear();
    }
    
    public void reverse() {
        Collections.reverse(list);
    }
    
    public void display() {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }
    
    public void sortPriority() {
        for (int i = 1; i < list.size(); i++) {
            for (int j = 0; j < list.size()-1; j++) {
                if(list.get(j).compareTo(list.get(j+1))>0) {
                    E temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }
    }
}
