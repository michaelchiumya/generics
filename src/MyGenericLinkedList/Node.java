package MyGenericLinkedList;

public class Node<T> {
    private Node next;
    private Node prev;
    private T data;

    public Node(T data){ data = data; }

    public Node() {}

    public void setNext(Node elem) { next = elem; }

    public void setPrev(Node elem) { prev = elem; }

    public Node getNext() {
        return next;
    }

    public T getData(){
        return data;
    }
}
