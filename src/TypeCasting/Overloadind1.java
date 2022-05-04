package TypeCasting;

public class Overloadind1<c> {
    public static void main(String[] args) {

        Overloadind1 overloadind1 = new Overloadind1();
        overloadind1.street(10, 25);
        overloadind1.street("Naman");
        overloadind1.street("kunal");
    }

    public void street (int a, int b){
    int c = a+b;
        System.out.println("Print sum of two number"+" "+c);

    }
    public void street (String a){
        System.out.println("print the street a ="+a);

    }
    public void street (String a, String b){
        System.out.println("print the street b=+x+b");

    }


}
