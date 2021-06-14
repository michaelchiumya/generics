package genericCollection;

import myGenericArrayList.GenericArrayList;

public class GenericCollectionTester {

        public static void main(String[] args) {
            GenericArrayList<Person> myList = new GenericArrayList<>();


            myList.add(new Person(23,"Minchin", "Tim"));
            myList.add(new Person(19, "DiCamillo", "Kate"));
            myList.add(new Person(90,"Minchin", "Tim"));
            myList.add(new Person(24, "Bryson", "Bill"));
            myList.add(new Person(60, "Markus", "chiumya"));
           // myList.add(new Person(26, "Ness", "Patrick"));
            printList("Original List:", myList);
            //This method uses compareTo() to sort
            GenericCollections.sort(myList);
            System.out.println("\n" + "Max index :" + GenericCollections.max(myList));
            printList("\nSorted List based on natural ordering (age):", myList);

        }
        public static void printList(String message, GenericArrayList<Person> listToPrint)
        {
            System.out.println(message);
            for (Person currPerson: listToPrint)
            {
                System.out.println(currPerson.toString());
            }
        }
    }

