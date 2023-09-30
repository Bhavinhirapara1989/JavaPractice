package lactureSix;

public class ImplementMethods {

    public static void main(String[] args) {
        ImplementMethods implementMethods = new ImplementMethods();
        implementMethods.sumOfThreeNumbers();
        implementMethods.sumOfTwoNumbers();
        ImplementMethods implementMethods1= new ImplementMethods();
        implementMethods.multiplicationOfTwoNumber();
        //multiplicationOfTwoNumber();
        divisonOfTwoNumber();
    }
    public void sumOfTwoNumbers() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
    }
    public void sumOfThreeNumbers(){
        int a = 15;
        int b = 20;
        int c = 25;
        int d = a + b + c;
        System.out.println(d);
    }
    public void multiplicationOfTwoNumber(){
        int a = 10;
        int b = 20;
        int c = a * b;
        System.out.println(c);
    }
    public static void divisonOfTwoNumber(){
        //to get answer in 0.0025 in division than to use FLOT (not int)
        float a = 10;
        float b = 40;
        float c = a/b;
        System.out.println(c);
    }
}
