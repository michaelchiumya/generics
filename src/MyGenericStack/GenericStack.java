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
        //check if buffer has items
        if (buffer[0] == null){
            //add first item if empty
            add(element);
        }else {
            T holder = (T) buffer[0];
            //set new element at the top
            set( 0, element);
            //add old elements on the bottom of stack
            add(nextFreeLocation, holder);
        }
        // set first index as head
        head = (T) buffer[0];
        length++;
    }

    /**
     * Removes the object at the top of this stack and returns that
     * object as the value of this function.
     *
     * @return The object at the top of this stack
     */
    @Override
    public Object pop() {
        length--;
       return remove(0);//remove the first index

    }

    /**
     * @return the object at the top of this stack
     */
    @Override
    public Object peek() {
       return buffer[0];//return the first index
    }

    @Override
    public void enque(Object element) { length++; push(element); //add to the top of stack
         }

    @Override
    public Object dequeue() {
        T item = (T) buffer[0];
        super.remove(item);
        length--;
        return item;
    }

    @Override
    public Object first() { return head;}//return head

    @Override
    public boolean empty() {
        return length == 0;//check if empty
    }

    @Override
    public Iterator iterator() {
        return new GenericArrayListIterator(stackData, nextFreeLocation);
    }

}
