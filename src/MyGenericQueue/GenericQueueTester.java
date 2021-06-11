package MyGenericQueue;

import myGenericArrayList.GenericArrayListIterator;

import java.util.Iterator;

public class GenericQueueTester implements Iterable{

    public static void main (String[] args) throws Exception {
        GenericQueue<String> colleges = new GenericQueue<>();

        System.out.println("check Empty "+ colleges.isEmpty());

        colleges.enque("DIT");
        colleges.enque("LYIT");

        System.out.println("Head :" + colleges.first() );
        System.out.println();
        System.out.println("Check if contain lyit " + colleges.contains("LYIT"));
        System.out.println();

        System.out.println("check list :");
        for(GenericArrayListIterator<String> iterator = (GenericArrayListIterator<String>) colleges.iterator(); iterator.hasNext(); ){
            String currElement = iterator.next();
            System.out.print(currElement + " ");
        }

        System.out.println();
        System.out.println("dequeue.....");
        colleges.dequeue();
        System.out.println();

        System.out.println("check list after dequeue........");
        for(GenericArrayListIterator<String> iterator = (GenericArrayListIterator<String>) colleges.iterator(); iterator.hasNext(); ){
            String currElement = iterator.next();
            System.out.print(currElement + " ");
        }

        System.out.println();
        System.out.println("enqueue :dcu.........");
        colleges.enque("DCU");
        System.out.println();

        System.out.println("check list after enqueue :");
        for(GenericArrayListIterator<String> iterator = (GenericArrayListIterator<String>) colleges.iterator(); iterator.hasNext(); ){
            String currElement = iterator.next();
            System.out.print(currElement + " ");
        }



    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
