package basics.collections;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String>carnames=new LinkedList<>();

        carnames.add("BMW");
        carnames.add("Audi");
        carnames.add("Tesla");
        carnames.add("Mercedes");
        System.out.println("List of cars: " + carnames);

        carnames.addFirst("Ford");
        System.out.println("First element added: " + carnames);             //Added first in list

        carnames.addLast("Honda");            //Added last in list
        System.out.println("Last element added: " + carnames);

        carnames.add(1,"Porsche");
        System.out.println("Element added using index: " + carnames);

        System.out.println("Does the list contains tesla? " + carnames.contains("Tesla"));

        System.out.println(carnames.getFirst());

        carnames.add("Kia");
        System.out.println(carnames);

        System.out.println(carnames.getLast());

        carnames.remove("Honda");
        System.out.println(carnames);

        System.out.println(carnames.size());

        System.out.println("Is List Empty?: " + carnames.isEmpty());

        System.out.println("Remove First Element: " + carnames.removeFirst());
        System.out.println("Remove Last Element: " + carnames.removeLast());

        carnames.clear();
        System.out.println(carnames);
    }
}
