package MyGenericLinkedList;

import java.util.Iterator;


public class GenericLinkedListIterator<T>  implements Iterator<T> {

    private Node current;

    public GenericLinkedListIterator(Node head) { current = head;}




    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        Node temp = current;
        current = current.getNext();
        return (T) temp;

    }
}
