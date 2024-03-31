/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecavirtual;

/**
 *
 * @author user
 */
public class Stack<T> extends List<T> {

    public Stack() {
        super();
    }

    public void push(T item) {
        pushBack(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T item = tail.data;
        removeLastNode();
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return tail.data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    private void removeLastNode() {
        if (isEmpty()) {
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
}