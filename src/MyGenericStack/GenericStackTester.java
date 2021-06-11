package MyGenericStack;


import myGenericArrayList.GenericArrayListIterator;

public class GenericStackTester {

    public static void main (String[] args) throws Exception {
        GenericStack<String> myQ = new GenericStack<>();
        System.out.println("Empty :" + myQ.empty());
        System.out.println();

        System.out.println("Stack data");
        myQ.push("go");
        myQ.push("stay");

        /* iterate using enhanced for loop and custom iterator*/
        for(GenericArrayListIterator<String> iterator = (GenericArrayListIterator<String>) myQ.iterator(); iterator.hasNext(); ){
            String currElement = iterator.next();
            System.out.print(currElement + " ");
        }

        System.out.println();
        System.out.println("Stacking items....");
        myQ.push("run");

        for(GenericArrayListIterator<String> iterator = (GenericArrayListIterator<String>) myQ.iterator(); iterator.hasNext(); ){
            String currElement = iterator.next();
            System.out.print(currElement + " ");
        }

        System.out.println();
        System.out.println("getting ready to peek..");
        System.out.println(myQ.peek());
        System.out.println();

        System.out.println("getting ready to pop..");
        System.out.println(myQ.pop());
        System.out.println();


    }
}
