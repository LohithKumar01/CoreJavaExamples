package maps;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("John");
        set.add("Joe");
        set.add("Tom");
        set.add("Tim");
        set.add("Tim");
        set.add("Carrie");
        set.forEach(str->{});
        for (String s : set) {
            
        }
        System.out.println("The set with repeating names: "+set);
        System.out.println("There are "+set.size()+" in a group.");

        if(set.contains("Tim")){
            System.out.println("Tim is present in the group.");
        }else {
            System.out.println("Tim is not in the group.");
        }
        System.out.println("Is the set empty: "+set.isEmpty());

        Set<String>set1=new HashSet<>();
        set1.add("Rhys");
        set1.add("Ronald");
        System.out.println(set1);
        set.addAll(set1);
        System.out.println("Adding both sets: "+set);
        set.remove("Tim");
        System.out.println("Final Set: "+set);
    }
}
