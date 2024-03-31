/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecavirtual;

/**
 *
 * @author user
 */
import java.util.ArrayList;

/**
 *
 
@author acsor*/
import java.util.ArrayList;

/**
 *
 
@author acsor*/
class List<T> {
    protected Node<T> head;
    protected Node<T> tail;

    protected static class Node<T> {
        protected T data;
        protected Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public List() {
        head = null;
        tail = null;
    }

    public void pushBack(T item) {
        Node<T> newNode = new Node<>(item);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void pushFront(ArrayList<T> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            Node<T> newNode = new Node<>(list.get(i));
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;
                if (newNode.next == null) {
                    tail = newNode;
                }
            }
        }
        list.clear();
    }
}