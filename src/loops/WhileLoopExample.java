package loops;

public class WhileLoopExample {
    public static void main(String[] args) {
        int count=1;
        int number=4;
        int finalNumber=20;
        while(count<=10) {
            System.out.println(count);
            count++;
        }
        while(number<=finalNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number: "+number);
        }

        }

    public static boolean isEvenNumber(int number){
        int i=0;

        do {
            System.out.println("test");
            if( i == 3){break;}
            i++;
        }while(true);

        System.out.println(i);

        if(number%2==0){
            return true;
        }
        else{
            return false;
        }


    }
}
