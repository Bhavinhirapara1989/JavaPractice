package lactureSix;

public class ReturnTypeMethod {
    public static void main(String[] args) {
        int c = sumOfTwoNumbers(10, 30);
        System.out.println(c);

        int d = subtractionOfTwoNumbers(40, 20);
        System.out.println(d);
    }
    public static int sumOfTwoNumbers(int a, int b){
        int c = a + b;
        System.out.println(c);
        return c;
    }
    public static int subtractionOfTwoNumbers(int a, int b){
        int d = a - b;
        return d;
    }
}
