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
        Node temp=new Node(elem);
        this.index(size-1);
        current.setNext(temp);
        this.size++;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T set(int index, T element) {
        index(index);
        current.setData(element);
        return (T) current.getData();
    }

    @Override
    public T get(int index) {
        this.index(index);
        return (T) current.getData();
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public T remove(int i) {
        if(i > size-1) return (T) new IndexOutOfBoundsException("index out of bounds");
        index(i);
        current.setNext(current.getNext().getNext());
        size--;
        return null;
    }

    @Override
    public boolean remove(T elem) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
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
    public void rotate(int distance) {

    }


    public void index(int i) {//i starts from 0
        int j=0;
        current=head;
        while(j<=i && current!=null) {//If i starts counting from 1, judge j<i
            current=current.getNext();
            j++;
        }
    }

}
