package myGenericArrayList;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GenericArrayListIterator<T> extends GenericArrayList<T> implements Iterator<T> {

    private int cursor = 0;
    private T[] newBuffer;

    public GenericArrayListIterator(T[] buffer, int nextFreeloc) {
        nextFreeLocation = nextFreeloc;
        newBuffer = buffer;
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
   //used for loop in enhanced for loop, cursor var must increment to call the next index
        return newBuffer[cursor++];
    }
    @Override
    public void remove() {
        throw new UnsupportedOperationException("not supported yet");
    }
}

