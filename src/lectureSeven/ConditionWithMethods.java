package lectureSeven;

public class ConditionWithMethods {

    //deposit
    //withdraw
    public static int balance = 1000;

    public static void main(String[] args) {
        deposit(100);
    }
    public static void deposit(int amount){
        balance = balance + amount;

    }

    public static void withdraw(int amount){
        if (balance>=amount){
            System.out.println("yes you can withdraw money");
            balance = balance-amount;

    }else {
            System.out.println("sorry you don't have enough balance");
        }
}
}
