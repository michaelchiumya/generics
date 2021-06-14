package MyGenericLinkedList;

import myGenericArrayList.GenericArrayListIterator;

public class GenericLinkedListTester {

    public static void main(String[] args){

        GenericLinkedList<Integer> list1 = new GenericLinkedList<>();


        System.out.println("LinkedList empty: " + list1.isEmpty() + "\n" + "adding elements 10 20 30...");
        list1.add(10);
        list1.add(20);
        list1.add(30);
        System.out.println();

        System.out.println( "LinkedList empty: " + list1.isEmpty() + "\n");
        System.out.println("linked list size : " + list1.size());

        GenericLinkedListIterator<Integer> iterator = (GenericLinkedListIterator<Integer>) list1.iterator();
        while(iterator.hasNext()){

            System.out.print("list : " + iterator.next() + " " +"\n");
        }

        System.out.println("get index 2 :" +  list1.get(2));
        System.out.println("\n" + "contain 60 : " + list1.contains(60));
        System.out.println( "contain 10 : " + list1.contains(10));


        //System.out.println("\n" + "remove index 3 :" +  list1.remove(1));

        System.out.println("set index 1 to 12" + "\n");
        list1.add(1, 12);
        GenericLinkedListIterator<Integer> iterator2 = (GenericLinkedListIterator<Integer>) list1.iterator();
        while(iterator2.hasNext()){

            System.out.print("list : " + iterator2.next() + " " +"\n");
        }

        System.out.println("remove index 3 :" + "\n");
        list1.remove(3);
        GenericLinkedListIterator<Integer> iterator3 = (GenericLinkedListIterator<Integer>) list1.iterator();
        while(iterator3.hasNext()){
            System.out.print("list : " + iterator3.next() + " " +"\n");
        }






    }


}
