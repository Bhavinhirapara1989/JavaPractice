package Loops;

public class FindEvenNumber {
    public static void main(String[] args) {
        findEven(100,300);
    }

    public static void findEven(int startNumber, int endNumber){

        System.out.println("This is my evennumber from "+startNumber+" to "+endNumber);

        System.out.println("--------------------------------------------------------");

        for(int i = startNumber; i<=endNumber; i++){
            if(i%3==0){
                System.out.println("my Evennumber is " +i);

            }
        }
    }
}
