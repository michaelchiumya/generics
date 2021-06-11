package MyGenericStack;

import MyInterfaces.IQueue;
import MyInterfaces.IStack;
import myGenericArrayList.GenericArrayList;
import myGenericArrayList.GenericArrayListIterator;
import java.util.Iterator;

public class GenericStack<T> extends GenericArrayList implements IQueue, IStack {

    private T[] stackData;
    private int length ;
    private T head;


    public GenericStack() {
        super();
        head =  null;
        length = 0;
        stackData = (T[]) buffer;
    }

    /**
     * Pushes an item onto the top of this stack
     * @param element the element argument.
     */
    @Override
    public void push(Object element) {
      add(element);
      head = (T) get(0);
    }

    /**
     * Removes the object at the top of this stack and returns that
     * object as the value of this function.
     *
     * @return The object at the top of this stack
     */
    @Override
    public Object pop() {
       return null;
    }

    /**
     * @return the object at the top of this stack
     */
    @Override
    public Object peek() {
       return stackData[currentCapacity-1];
    }

    @Override
    public void enque(Object element) { super.add(element); }

    @Override
    public Object dequeue() {
        T item = (T) buffer[0];
        super.remove(item);
        return item;
    }

    @Override
    public Object first() { return head;}

    @Override
    public boolean empty() {
        return length == 0;
    }

    @Override
    public Iterator iterator() {
        return new GenericArrayListIterator(stackData, nextFreeLocation);
    }
}
