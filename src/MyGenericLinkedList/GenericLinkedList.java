package MyGenericLinkedList;

import java.util.Iterator;
import MyInterfaces.IList;

public class GenericLinkedList<T> implements IList<T>, Iterable<T> {

     Node head;
     Node tail;
    public GenericLinkedList(){
        head = tail = null;
    }

    class Node<T> {
        private Node next;
        private Node prev;
        private T data;

        public Node(T data){ data = data; }

        public Node() {}

        public void setNext(Node elem) { next = elem; }

        public void setPrev(Node elem) { prev = elem; }

        public Node getNext() {
            return next;
        }

        public T getData(){
            return data;
        }
    }


    @Override
    public void add(T elem) {
        Node temp = new Node(elem);
        temp.setNext(null);

        if (head == null){
            temp.setPrev(null);
            head = tail = temp;
        }else {
            temp.setPrev(null);
            tail.setNext(temp);
            tail = temp ;
        }

    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T set(int index, T element) {
        Node newNode = new Node(element);
        Node node = head;

        for (int i = 0; i < index - 1; i++) {
            node = node.getNext();
        }
        newNode.setNext(node.getNext());
        node.setNext(newNode);
        return element;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public T remove(int index) {
       Node node = head;

        for (int i = 0; i < index - 1 ; i++) {
            node.getNext();
        }

         return get(index);
    }

    @Override
    public boolean remove(T elem) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public boolean contains(T element) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
       return null;
    }

    @Override
    public void rotate(int distance) { }

    public void printList() {
        if (head == null){
            Node current = head;
              while (current.getNext() != null){
                  System.out.println(current.getData());
                  current = current.getNext();
              }
            System.out.println(current.getData());
        }

    }
}
