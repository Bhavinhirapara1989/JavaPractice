package Loops;

public class Mammal extends Animal1 {
    public static void main(String[] args) {

        Mammal mammal = new Mammal();
        mammal.nameOfDog();
    }
// overriding
    public void nameOfDog(){
        System.out.println("Jhony");
    }
}
