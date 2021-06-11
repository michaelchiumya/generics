package MyGenericLinkedList;

public class GenericLinkedListTester {

    public static void main(String[] args){

        GenericLinkedList<String> cities = new GenericLinkedList<>();

        System.out.println();
        System.out.println("adding  to List *********");
        cities.add("Galway");
        cities.add("Dublin");
        cities.add("Cork");
        System.out.println();
        System.out.println("items added to list");

        System.out.println();
        System.out.println("setting item to List *********");
        cities.set(2,"Galway");
        System.out.println();
        System.out.println("set");

        System.out.println();
        System.out.println("remove item from list List *********");
        System.out.println(cities.set(2,"Galway"));
        System.out.println();
        System.out.println("removed");

        cities.printList();





    }


}
