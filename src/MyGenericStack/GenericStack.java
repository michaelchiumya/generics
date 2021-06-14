package MyGenericStack;

import MyGenericLinkedList.GenericLinkedList;
import MyGenericLinkedList.GenericLinkedListIterator;
import MyGenericLinkedList.Node;
import MyInterfaces.IQueue;
import MyInterfaces.IStack;
import java.util.Iterator;

public class GenericStack<T> extends GenericLinkedList implements IQueue, IStack {


    private int length ;

    public GenericStack() {
        super();
        length = 0;
    }

    /**
     * Pushes an item onto the top of this stack
     * @param element the element argument.
     */
    @Override
    public void push(Object element) {
        add(element);
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
       return super.head.getData();//return the first index
    }

    @Override
    public void enque(Object element) {
       add(element); //add to the top of stack
        length++;
         }

    @Override
    public Object dequeue() {
        length--;
        return remove(0);//remove the first index
    }

    @Override
    public Object first() { return head.getData();}//return head

    @Override
    public boolean empty() {
        return length == 0;//check if empty
    }

    @Override
    public Iterator iterator() {
        return new GenericLinkedListIterator((Node) head);
    }

}
