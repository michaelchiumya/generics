package MyGenericLinkedList;

import myGenericArrayList.GenericArrayListIterator;

public class GenericLinkedListTester {

    public static void main(String[] args){

        GenericLinkedList<Integer> list1 = new GenericLinkedList<>();
        System.out.println("LinkedList empty: " + list1.isEmpty() + "\n" + "adding elements 10 20 30...");

        list1.add(10);
        list1.add(20);
        list1.add(30);
        System.out.println("\n");
        list1.printList();
        System.out.println("\n" + "LinkedList empty: " + list1.isEmpty() + "\n");
        System.out.println("\n" + "linked list size : " + list1.size());

        /* iterate using enhanced for loop and custom iterator*/
//        for(GenericLinkedListIterator<Integer> iterator = (GenericLinkedListIterator<Integer>) list1.iterator(); iterator.hasNext(); ){
//            int currElement = iterator.next();
//            System.out.print(currElement + " " );
//        }

        System.out.println("get index 2 :" +  list1.get(2));
        System.out.println("\n" + "contain 60 : " + list1.contains(60));
        System.out.println( "contain 10 : " + list1.contains(10));




        //System.out.println("\n" + "remove index 3 :" +  list1.remove(1));

        System.out.println("remove index 1" + "\n");
        list1.remove(2);



    }


}
