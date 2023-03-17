package maps;
import java.util.Set;
import java.util.TreeSet;
public class UniqueAscendingOrder {
    public static void main(String[] args) {
        int[] arrayList = {10,5,20,15,25,25,25,30,50,45,100,101,100,100};
        Set<Integer> numberSet = new TreeSet<Integer>();
        for (int num = 0; num < arrayList.length; num++) {
            numberSet.add(arrayList[num]);
        }
        System.out.println(numberSet);
    }
}
