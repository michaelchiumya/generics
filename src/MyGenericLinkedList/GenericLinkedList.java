package MyGenericLinkedList;

import java.util.Iterator;
import MyInterfaces.IList;

public class GenericLinkedList<T> implements IList<T>, Iterable<T> {

    private Node head;
    private Node current;
    int size = 0;


    public GenericLinkedList() {
        head = current = new Node(null);
    }


    @Override
    public void add(T elem) {
        Node newNode = new Node();
        newNode.setData(elem);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    @Override
    public void add(int index, T element) {
        if(index == 0){
            add(element); //We already have a function to do this.
        }else{
            Node newNode = new Node(element);
            Node currentNode = head;
            for(int i = 0; i < index - 1; i++) {
                currentNode = currentNode.getNext();
            }
            newNode.setNext(currentNode.getNext());
            currentNode.setNext(newNode);
        }

    }

    @Override
    public T set(int index, T element) {
        Node current = head;
        int counter = 0;
        while (current != null && index > counter) {
            current = current.getNext();
            counter++;
        }
        current.setNext(current.getNext());
        current = current.getNext();
        return null;
    }
    @Override
    public T get(int index) {
        Node current = head;
        int counter = 0;
        while(current != null && index > counter){
            current = current.getNext();
            counter++;
        }

        return (T) current.getData();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T remove(int index) {
        if(index == 0) {
            head = head.getNext();
        }else{
            Node currentNode = head;
            for(int i = 0; i < index - 1; i++) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext( currentNode.getNext().getNext());
        }


        return null;
    }

    @Override
    public boolean remove(T elem) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(T element) {
        Node current = head;
        while(current != null ){
             if (current.getData() == element){ return true; }
            current = current.getNext();
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new GenericLinkedListIterator<T>(head);
    }

    @Override
    public void rotate(int distance) {

    }

}
