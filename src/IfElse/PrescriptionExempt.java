package IfElse;

public class PrescriptionExempt {
    public static void main(String[] args) {
        int age = 60;
        System.out.println("your age is"+ age);
        if (age<16){
            System.out.println("Exempt B");
        }else if (age>16)
            System.out.println("To pay");
        else if (age<16){
            System.out.println("Exempt A");
        }

    }

}
