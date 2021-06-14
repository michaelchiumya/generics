package MyGenericLinkedList;

import java.util.Iterator;


public class GenericLinkedListIterator<T>  implements Iterator<T> {

    private Node current;
    private int counter = 0;

    public GenericLinkedListIterator(Node first) {
        current = first;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        Node tempo = current;
        current = current.getNext();
        return (T) tempo.getData();
    }
}
