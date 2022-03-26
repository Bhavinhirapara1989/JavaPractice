package Operator;

public class LogicalOperator {
    public static void main(String[] args) {
        int a=6;
        int b=8;

        System.out.println(a<8 && b>6);// logical and opertoe &&
        System.out.println(a>8 && b<6);

        System.out.println(a>4 || b>9);// a is true and b is false but still it will come true
        System.out.println(a>7 || b>9);
        System.out.println((a>7 || b>9));





    }
}
