package TypeCasting;

public class TypeCasting1 {
    public static void main(String[] args) {
        int myInt = 11; // widecasting

        System.out.println(myInt);
        double myDouble = myInt;
        System.out.println(myDouble);

        // Narrow Casting
        double myDouble1 = 11.85;
        System.out.println(myDouble1);
        int myInt1 = (int) myDouble1;
        System.out.println(myInt1);


    }
}
