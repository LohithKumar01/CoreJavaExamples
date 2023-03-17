package arrays;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>(); //Creating new Linked list
        names.add("Alice");
        names.add("Tim");
        names.add("Charlie");
        names.addFirst("Joe");
        names.addLast("John");

        System.out.println("---The names of people in the list---");

        for (String name : names) {
            System.out.println(name);
        }

        String firstPerson = names.getFirst();
        System.out.println("The first person is: " + firstPerson);
        names.set(1, "David");

//        names.removeLast();
        System.out.println("Removed last name: "+names.removeLast());


        System.out.println("All people in the LinkedList:");
        for (String name : names) {
            System.out.println(name);
        }

        boolean containsBob = names.contains("Bob");
        System.out.println("The LinkedList contains Bob? " + containsBob);

        int size = names.size();
        System.out.println("The LinkedList has " + size + " elements.");

        names.clear();
        System.out.println("Cleared: "+names);

    }
}
