package basics.arrays;

import java.util.Arrays;

public class StringArrayLength {
    public static void main(String[] args) {
        String[] stringArray = {"abc","basfsd","abasdasc","caxc","baz","abxzs"};
//        for(int i=0;i< stringArray.length;i++){
//            System.out.println("String Name:"+stringArray[i]+" String Length:"+stringArray[i].length());
//        }
        Arrays.stream(stringArray).parallel()
                .forEach(element -> System.out.println(element + "-" +element.length()));
    }
}
