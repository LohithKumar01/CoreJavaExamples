//import exception.ReadFromFile;    //exception -> ReadFromFile
//
//public class Main{
//    public static void main(String[] args) {
//            new ReadFromFile().readFile();
//    }
//}

//public class Main {       //inheritance->Car
//    public static void main(String[] args) {
//        Car car=new Car();
//        car.setMake("Tesla");
//        car.setModel("Model Y");
//        car.setColor("Red");
//        car.setDoors(4);
//        car.describeCar();
//    }
//}

//public class Main {     //inheritance->Account
//    public static void main(String[] args) {
//        Account myAccount=new Account();
//        myAccount.setNumber("11006111");
//        myAccount.setCustomerName("Mark Brown");
//        myAccount.setCustomerEmail("marky21@gmail.com");
//        myAccount.setCustomerMobile("(214) 877-2245");
//        myAccount.setBalance(10000);
//        myAccount.withdrawlFunds(200);
//        System.out.println(myAccount.getCustomerEmail());
//    }
//}

//import inheritance.Customer;
//
//public class Main {     //inheritance->Customer
//    public static void main(String[] args) {
//        Customer customer=new Customer("Tony",10000,"tony1234@mail.com");
//        System.out.println(customer.getCustomerCreditLimit());
//        System.out.println(customer.getCustomerName());
//        System.out.println(customer.getCustomerEmail());
//
//    }
//}

//import inheritance.Employee;
//import inheritance.HourlyEmployee;
//import inheritance.SalariedEmployee;
//
//public class Main {
//    public static void main(String[] args) {
//        Employee tim=new Employee("Tony","05/11/1985",100102,"02/12/2019");
//        System.out.println(tim);
//        System.out.println("Age of tim is "+ tim.getAge());
//        System.out.println("------------------------------------");
//
//        SalariedEmployee joe=new SalariedEmployee("Joe","02/02/1990",1011,"12/03/2018",35000);
//        System.out.println(joe);
//        System.out.println("Annual Salary for Joe is: "+joe.collectPay());
//        System.out.println("------------------------------------");
//
//        HourlyEmployee john=new HourlyEmployee("John","02/03/1999",10101,"12/12/2021",10);
//        System.out.println(john);
//        System.out.println("Hourly Pay for John is: "+john.getDoublePay());
//        System.out.println("------------------------------------");
//
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        String str="University of North Texas";
//        String[] stringSplit = str.split(" ");
//        int arraylength = stringSplit.length;
//        System.out.println(stringSplit[arraylength-1]);
//    }
//}

public class Main {
    public static void main(String[] args) {
        int highScorePosition=calculateHighScorePosition(1500);
        displayHighScorePosition("Kim",highScorePosition);
    }

//    public static void calculateSCore(boolean gameOver, int score, int levelCompleted, int bonus) {
//        int finalScore = score;
//        if (gameOver == true) {
//            finalScore += (levelCompleted * bonus);
//            System.out.println("Your final score is " + finalScore);
//        }
//    }
    public static void displayHighScorePosition(String playerName,int playerPosition){
        System.out.println(playerName + " managed to get into position "+playerPosition+" on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >=1000){
            return 1;
        } else if ((playerScore >= 500)&&(playerScore<1000)) {
            return 2;
        } else if ((playerScore >= 100) && (playerScore < 500)) {
            return 3;
        }else {
            return 4;
        }
    }
}