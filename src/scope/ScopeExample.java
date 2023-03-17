package scope;

public class ScopeExample {
    public static void main(String[] args) {

    }
    int classVar=10;
    public void exampleMethod() {
        int x = 5;
        if (x == 5) {
            int blockVar = 10;
            System.out.println(blockVar);
        }
//        System.out.println(blockVar); //Declared inside the block cannot be accessed outside the block.
        System.out.println(classVar); //Scope of class variable
        System.out.println(x); //x is local variable
    }
}