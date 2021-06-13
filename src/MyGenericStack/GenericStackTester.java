package MyGenericStack;


import myGenericArrayList.GenericArrayListIterator;

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

        /* iterate using enhanced for loop and custom iterator*/
        for(GenericArrayListIterator<String> iterator = (GenericArrayListIterator<String>) myQ.iterator(); iterator.hasNext(); ){
            String currElement = iterator.next();
            System.out.print(currElement + " ");
        }
        System.out.println();

        System.out.println("\n" + "PEEK :" + myQ.peek());
        System.out.println( "First :" + myQ.first());
        System.out.println( "POP :" + myQ.pop());
        for(GenericArrayListIterator<String> iterator = (GenericArrayListIterator<String>) myQ.iterator(); iterator.hasNext(); ){
            String currElement = iterator.next();
            System.out.print(currElement + " ");
        }
        System.out.println();

        System.out.println("\n" + "enqueue spin:" );
        myQ.enque("spin")  ;

        for(GenericArrayListIterator<String> iterator = (GenericArrayListIterator<String>) myQ.iterator(); iterator.hasNext(); ){
            String currElement = iterator.next();
            System.out.print(currElement + " ");
        }
        System.out.println();

        System.out.println("\n" + "dequeue:" );
        myQ.dequeue()  ;

        for(GenericArrayListIterator<String> iterator = (GenericArrayListIterator<String>) myQ.iterator(); iterator.hasNext(); ){
            String currElement = iterator.next();
            System.out.print(currElement + " ");
        }

//        System.out.println( "\n" + "dequeue:");
//        myQ.dequeue();
//        System.out.println( "\n" + "list:" );
//        for(GenericArrayListIterator<String> iterator = (GenericArrayListIterator<String>) myQ.iterator(); iterator.hasNext(); ){
//            String currElement = iterator.next();
//            System.out.print(currElement + " ");
//        }

    }
}
