import myGenericArrayList.GenericArrayList;
import MyGenericLinkedList.GenericLinkedList;

import java.util.Iterator;

public class GenericsTester implements Iterable {

    public static void main(String[] args){

        GenericArrayList<Integer> decades = new GenericArrayList<>();
        GenericArrayList<String> names = new GenericArrayList<>();


//        System.out.println("preparing to add 2 ints to show generic in custom arrayList.... :");
//        decades.add(1980);
//        decades.add(1990);
//        decades.add(1990);
//        System.out.println("integers added : " + decades.isEmpty());
//        System.out.println();



//        System.out.println("get string arraylist Size initially.... :");
//        System.out.println("ArrayList size : " + names.size());
//        System.out.println();
//
//        System.out.println("Is Empty : ");
//        System.out.println(names.isEmpty());
//        System.out.println();
//
//        System.out.println("preparing to add 3 items to arrayList.... :");
//        names.add("Michael");
//        names.add("Markus");
//        names.add("Millie");
//        System.out.println("items added.....");
//        System.out.println();
//
//        System.out.println("preparing to add 2 more items to arrayList.... :");
//        names.add("Oliver");
//        names.add("Jack");
//        System.out.println("items added.....");
//
//        System.out.println("get new arraylist Size.... :");
//        System.out.println("ArrayList size : " + names.size());
//        System.out.println();
//
//        names.add("add at index 5");
//        names.add(5, "Oliver");
//        System.out.println("new item added at index 5.....");
//        System.out.println();
//
//        System.out.println("edit index at 2 set Jackson");
//        names.set(2, "jackson");
//        System.out.println("item changed.....");
//        System.out.println();
//
//        System.out.println("check if contain changed item :");
//        System.out.println("contain :" + names.contains("jackson"));
//        System.out.println();
//
//        System.out.println("check list :");
//
//        /* iterate using enhanced for loop */
//        for(Iterator<String> iterator = names.iterator(); iterator.hasNext(); ){
//            String currElement = iterator.next();
//            System.out.print(currElement + " ");
//        }


}

    @Override
    public Iterator iterator() {
        return null;
    }
}
