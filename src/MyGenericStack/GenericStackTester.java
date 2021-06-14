package MyGenericStack;


import MyGenericLinkedList.GenericLinkedListIterator;

public class GenericStackTester {

    public static void main (String[] args) throws Exception {
        GenericStack<String> myQ = new GenericStack<>();
        System.out.println("\n" + "Empty :" + myQ.empty());
        System.out.println();

        System.out.println("Stack data: walk, run, jump, sit");
        myQ.push("walk");
        myQ.push("run");
        myQ.push("jump");
        myQ.push("sit");
        //System.out.println("\n" + "length :" + myQ.);

        GenericLinkedListIterator<String> iterator2 = (GenericLinkedListIterator<String>) myQ.iterator();
        while(iterator2.hasNext()){
            System.out.print("list : " + iterator2.next() + " " +"\n");
        }

        System.out.println();

        System.out.println("\n" + "PEEK :" + myQ.peek());
        System.out.println( "First :" + myQ.first());
        //System.out.println( "POP :" + myQ.pop());
        GenericLinkedListIterator<String> iterator3 = (GenericLinkedListIterator<String>) myQ.iterator();
        while(iterator3.hasNext()){
            System.out.print("list : " + iterator3.next() + " " +"\n");
        }
        System.out.println();

        System.out.println("\n" + "enqueue spin:" );
        myQ.enque("spin") ;

        GenericLinkedListIterator<String> iterator4 = (GenericLinkedListIterator<String>) myQ.iterator();
        while(iterator4.hasNext()){
            System.out.print("list : " + iterator4.next() + " " +"\n");
        }
        System.out.println();

        System.out.println("\n" + "Empty :" + myQ.empty());
    }
}
