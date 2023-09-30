package lactureSix;

public class ReturnTypeMethodTwo {

    static int balance = 1000;

    public static void main(String[] args) {
        moneyWithdraw(200);
        System.out.println(balance);

        moneyDeposit(500);
        System.out.println(balance);

        int totalInterestGain = bankScheme(balance);
        System.out.println(totalInterestGain);
    }

    public static void moneyWithdraw(int withdraw) {
        balance = balance - withdraw;

    }

    public static void moneyDeposit(int deposit) {
        balance = balance + deposit;
    }

    public static int bankScheme(int balance) {
        int totalInterestGain = (balance * 5) / 100;
        return totalInterestGain;
    }
}
