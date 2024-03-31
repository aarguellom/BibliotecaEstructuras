/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecavirtual;

/**
 *
 * @author user
 */
public class LinkedList<T> extends List<T> {

    public LinkedList() {
        super();
    }

    public void add(T item) {
        pushBack(item);
    }

    public void addFirst(T item) {
        Node<T> newNode = new Node<>(item);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void removeFirst() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
    }

    public void removeLast() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }
        Node<T> current = head;
        while (current.next != tail) {
            current = current.next;
        }
        current.next = null;
        tail = current;
    }

    public void print() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public int size() {
        int count = 0;
        Node<T> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
