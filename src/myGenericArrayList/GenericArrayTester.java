package myGenericArrayList;

import java.util.Iterator;

public class GenericArrayTester implements Iterable{


        public static void main(String[] args){

        GenericArrayList<String> names = new GenericArrayList<>();

        System.out.println("\n" +"Get string arraylist Size initially.... :");
        System.out.println("ArrayList size : " + names.size());
        System.out.println();

        System.out.println(" check if is Empty : ");
        System.out.println(names.isEmpty());
        System.out.println();

        System.out.println("preparing to add 3 items to arrayList.... :");
        names.add("Michael");
        names.add("Markus");
        names.add("Millie");

                /* iterate using enhanced for loop and custom iterator*/
                for(GenericArrayListIterator<String> iterator = (GenericArrayListIterator<String>) names.iterator(); iterator.hasNext(); ){
                        String currElement = iterator.next();
                        System.out.print(currElement + " ");
                }

        System.out.println("\n" + "3 items added....." );
        System.out.println("\n" + " check if is Empty : ");
        System.out.println(names.isEmpty());
        System.out.println();

        System.out.println("preparing to add 2 more items to arrayList.... :");
        names.add("Sandra");
        names.add("Loon");

                /* iterate using enhanced for loop and custom iterator*/
                for(GenericArrayListIterator<String> iterator = (GenericArrayListIterator<String>) names.iterator(); iterator.hasNext(); ){
                        String currElement = iterator.next();
                        System.out.print(currElement + " ");
                }
        System.out.println("\n" + "2 items added.....");

        System.out.println("\n" +"add item Oliver at index 5");
        names.add(5, "Oliver");
        System.out.println("new item added at index 5.....");


                /* iterate using enhanced for loop and custom iterator*/
                for(GenericArrayListIterator<String> iterator = (GenericArrayListIterator<String>) names.iterator(); iterator.hasNext(); ){
                        String currElement = iterator.next();
                        System.out.print(currElement + " ");
                }

        System.out.println("\n" +"get string arraylist new Size.... :");
        System.out.println("ArrayList size : " + names.size());
        System.out.println();

        System.out.println("edit index at 2 set Jackson from millie");
        names.set(2, "jackson");
        System.out.println("item changed.....");
                /* iterate using enhanced for loop and custom iterator*/
                for(GenericArrayListIterator<String> iterator = (GenericArrayListIterator<String>) names.iterator(); iterator.hasNext(); ){
                        String currElement = iterator.next();
                        System.out.print(currElement + " " );
                }
        System.out.println();

        System.out.println("check if contain changed item (Jackson) :");
        System.out.println("contain :" + names.contains("jackson"));

        System.out.println();
        System.out.println("remove at index 2.....");
        System.out.println("removed item : " + names.remove( 2));
        System.out.println("item removed.....");

        for(GenericArrayListIterator<String> iterator = (GenericArrayListIterator<String>) names.iterator(); iterator.hasNext(); ){
            String currElement = iterator.next();
            System.out.print(currElement + " ");
        }


        System.out.println("\n" + "rotation : by 5");
        names.rotate(5);
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

