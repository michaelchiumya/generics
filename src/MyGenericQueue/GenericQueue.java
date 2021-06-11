package MyGenericQueue;

import MyInterfaces.IQueue;
import MyInterfaces.IStack;
import myGenericArrayList.GenericArrayList;
import myGenericArrayList.GenericArrayListIterator;

import java.util.Iterator;

public class GenericQueue<T> extends GenericArrayList implements IQueue, IStack {

    /**
     * custom generic queue class
     * @param head generic object for first element
     * @param queueData array object to start with
     */
    private T head, tail;
    private T[] queueData;

    public GenericQueue() {
        super();
        head = (T) get(0);
        queueData = (T[]) buffer;
    }

    /**
     * adds item at end of queue
     * @param element item to be added
     */
    @Override
    public void enque(Object element) {
        add(element);
        head = (T) get(0);
    }

    /**
     * removes item from start array object and return item
     */
    @Override
    public Object dequeue() throws Exception {
        //collect first element to be deleted
        T item = (T) queueData[0];
       //rotate out first element
       rotate(1);
        return item;
    }

    /**
     * return head
     */
    @Override
    public Object first() throws Exception { return head;}

    /**
     * add item from start array object and return item
     */
    @Override
    public void push(Object element) {
        this.enque(element);
    }

    /**
     * removes item from start array object and return item
     */
    @Override
    public Object pop() throws Exception { return dequeue();}

    /**
     * return item from start array object and return item
     */
    @Override
    public Object peek() {
        return head;
    }

    /**
     * check if queue object
     */
    @Override
    public boolean empty() { return buffer[0] == null;}

    @Override
    public Iterator iterator() {
        return new GenericArrayListIterator(queueData, nextFreeLocation);
    }
}