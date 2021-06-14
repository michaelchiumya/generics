package MyGenericQueue;

import myGenericArrayList.GenericArrayListIterator;

import java.util.Iterator;

public class GenericQueueTester {

    public static void main (String[] args) throws Exception {

        GenericQueue<String> colleges = new GenericQueue<>();

        System.out.println("check if empty : " + colleges.isEmpty());

        System.out.println("enqueue DIT ");
        colleges.enque("DIT");
        System.out.println("enqueue LYIT ");
        colleges.enque("LYIT");
        System.out.println("enqueue Trinity ");
        colleges.enque("Trinity");

        System.out.println("check list :");
        for(GenericArrayListIterator<String> iterator = (GenericArrayListIterator<String>) colleges.iterator(); iterator.hasNext(); ){
            String currElement = iterator.next();
            System.out.print(currElement + " ");
        }

        System.out.println("\n");

        System.out.println( "dequeue.... "+ colleges.dequeue());
        System.out.println("check list after dequeue........");
        for(GenericArrayListIterator<String> iterator = (GenericArrayListIterator<String>) colleges.iterator(); iterator.hasNext(); ){
            String currElement = iterator.next();
            System.out.print(currElement + " ");
        }

        System.out.println();

        System.out.println("\n" + "Check if contains lyit " + colleges.contains("LYIT"));
        System.out.println( "Check if contains DIT " + colleges.contains("DIT"));

        System.out.println("\n" + "push Maynooth ");
        colleges.push("Maynooth");
        System.out.println("check list after push........");
        for(GenericArrayListIterator<String> iterator = (GenericArrayListIterator<String>) colleges.iterator(); iterator.hasNext(); ){
            String currElement = iterator.next();
            System.out.print(currElement + " ");
        }

        System.out.println("\n" + "PEEK : " + colleges.peek());

        System.out.println( "\n" + "POP:" + colleges.pop());
        System.out.println("check list after pop........");
        for(GenericArrayListIterator<String> iterator = (GenericArrayListIterator<String>) colleges.iterator(); iterator.hasNext(); ){
            String currElement = iterator.next();
            System.out.print(currElement + " ");
        }

        System.out.println();
        System.out.println("\n" + "Empty : " + colleges.empty());
        System.out.println("Get first : " + colleges.first());

    }


}
