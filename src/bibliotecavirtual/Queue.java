/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecavirtual;

/**
 *
 * @author user
 */
public class Queue<T> extends List<T> {

    public Queue() {
        super();
    }

    public void enqueue(T item) {
        pushBack(item);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T item = head.data;
        removeFirstNode();
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return head.data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    private void removeFirstNode() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
    }
}
