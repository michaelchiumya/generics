package MyGenericLinkedList;

public class GenericLinkedListTester {

    public static void main(String[] args){

        GenericLinkedList<Integer> list1 = new GenericLinkedList<>();
        System.out.println("LinkedList empty: " + list1.isEmpty() + "\n" + "adding elements 10 20 30...");

        list1.add(10);
        list1.add(20);
        list1.add(30);
        System.out.println("LinkedList empty: " + list1.isEmpty() + "\n");
        for(int i=0;i<list1.size;i++) {
            System.out.println(list1.get(i));
        }

        System.out.println("set index 2 to 32" + "\n");
        list1.set(2, 32);
        for(int i=0;i<list1.size;i++) {
            System.out.println(list1.get(i));
        }

        System.out.println("\n" + "linked list size : " + list1.size());
        System.out.println("\n" + "remove index 3 :");
        list1.remove(1);

        for(int i=0;i<list1.size;i++) {
            System.out.println(list1.get(i));
        }

    }


}
