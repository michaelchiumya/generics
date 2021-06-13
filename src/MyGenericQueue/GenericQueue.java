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
    private T head;
    private T[] queueData;

    public GenericQueue() {
        super();
        head = (T) get(0);
        queueData = (T[]) super.buffer;
    }

    /**
     * adds item at end of queue
     * @param element item to be added
     */
    @Override
    public void enque(Object element) {
        super.add(element);
        head = (T) get(0);
    }

    /**
     * removes item from start array object and return item
     */
    @Override
    public T dequeue() throws Exception {
        //collect first element to be deleted
      T deleted = (T) super.get(0);
        super.remove (0);
        head = (T) get(0);
      return deleted;
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
    public Object pop() throws Exception { head = (T) get(0); return dequeue();}

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
    public boolean empty() { return super.isEmpty();}

    @Override
    public Iterator iterator() {
        return new GenericArrayListIterator(queueData, nextFreeLocation);
    }
}