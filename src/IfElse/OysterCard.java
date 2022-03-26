package IfElse;

public class OysterCard {
    public static void main(String[] args) {
        checkBalance(10);
        checkBalance(20);
        checkBalance(110);

    }

    public static void checkBalance(int balance) {

        if (balance > 15) {
            System.out.println("open gate");
        } else
            System.out.println("closed");
        if (balance < 10) {
            System.out.println("open gate");
        } else System.out.println("ask for recharge");
        if (balance > 100) {
            System.out.println("give 10% Discount");
        } else System.out.println("Don't give discount");
    }

}

