package maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DuplicateAscendingOrder {
    public static void main(String[] args){
        int arrayList[]= {20,15,20,5,10,10,5,15,40,45,35,20,45,45,50,50,50,50,100,101,101};
        List<Integer> numberList=new ArrayList<>();
            for (Integer num:arrayList){
                numberList.add(num);
                Collections.sort(numberList);
            }
        System.out.println(numberList);
    }
}
