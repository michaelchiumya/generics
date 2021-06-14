package myGenericArrayList;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GenericArrayListIterator<T> extends GenericArrayList<T> implements Iterator<T> {

    private int cursor = 0;
    private T[] newBuffer;

    public GenericArrayListIterator(T[] buffer, int nextFreeloc) {
        nextFreeLocation = nextFreeloc; //assign next free location index
        newBuffer = buffer; //set buffer for iteration
    }

    @Override
    public boolean hasNext() {
        return cursor < nextFreeLocation;
    }

    @Override
    public T next() {
        if(cursor == nextFreeLocation){
            throw new NoSuchElementException();
        }

        return newBuffer[cursor++];
    }
    @Override
    public void remove() {
        throw new UnsupportedOperationException("not supported yet");
    }
}

