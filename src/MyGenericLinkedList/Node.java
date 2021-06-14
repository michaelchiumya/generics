package MyGenericLinkedList;

public class Node<T> {

    private T data;
    //If you do not add the private modifier here (use the default), then you can directly access the member variables in the JLinkList class without writing the get set method
    private Node next;

    public Node(T obj) {
        data = obj;

    }
    public Node() {

    }

    public Node getNext() {
        return next;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
    public void setNext(Node next) {
        this.next = next;
    }

}
