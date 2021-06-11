package myGenericArrayList;

import java.util.Iterator;

public class GenericArrayTester implements Iterable{


        public static void main(String[] args){

        GenericArrayList<String> names = new GenericArrayList<>();

        System.out.println("get string arraylist Size initially.... :");
        System.out.println("ArrayList size : " + names.size());
        System.out.println();

        System.out.println(" check if is Empty : ");
        System.out.println(names.isEmpty());
        System.out.println();

        System.out.println("preparing to add 3 items to arrayList.... :");
        names.add("Michael");
        names.add("Markus");
        names.add("Millie");
        System.out.println("items added.....");
        System.out.println();

        System.out.println("preparing to add 2 more items to arrayList.... :");
        names.add("Sandra");
        names.add("Loon");
        System.out.println("items added.....");

        names.add("add at index 5");
        names.add(5, "Oliver");
        System.out.println("new item added at index 5.....");
        System.out.println();

        System.out.println("edit index at 2 set Jackson");
        names.set(2, "jackson");
        System.out.println("item changed.....");
        System.out.println();

        System.out.println("check if contain changed item :");
        System.out.println("contain :" + names.contains("jackson"));
        System.out.println();

        System.out.println("check list :");
        /* iterate using enhanced for loop and custom iterator*/
                for(GenericArrayListIterator<String> iterator = (GenericArrayListIterator<String>) names.iterator(); iterator.hasNext(); ){
                        String currElement = iterator.next();
                        System.out.print(currElement + " ");
                }

        System.out.println();
        System.out.println("remove at index 3.....");
        System.out.println("removed item : " + names.remove( 1));
        System.out.println("item removed at index 3.....");
        System.out.println();
        System.out.println("remove element Loon.....");
        System.out.println("removed item : " + names.remove( "Loon"));
        System.out.println("item removed .....");

        System.out.println("check list :");
        for(GenericArrayListIterator<String> iterator = (GenericArrayListIterator<String>) names.iterator(); iterator.hasNext(); ){
            String currElement = iterator.next();
            System.out.print(currElement + " ");
        }

        System.out.println();
        System.out.println("rotation : by 1");
        names.rotate(1);
        for(GenericArrayListIterator<String> iterator = (GenericArrayListIterator<String>) names.iterator(); iterator.hasNext(); ){
              String currElement = iterator.next();
                System.out.print(currElement + " ");
                }

        }

        @Override
        public Iterator iterator() {
            return null;
        }
    }

