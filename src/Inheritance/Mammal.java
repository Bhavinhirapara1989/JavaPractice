package Inheritance;

// inherited Animal class
public class Mammal extends Animal{
    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        System.out.println(mammal.x);
        mammal.animalName();
    }

    public void MyDogName(){
        System.out.println("Dog name is Tony");

    }
}
