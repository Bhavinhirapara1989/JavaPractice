package IfElse;

public class LeapYear {

    public static void main(String[] args) {
        int year = 1999;
        if (year % 4 == 0) {
            System.out.println("This is leap year");
        } else
            System.out.println("This is not leap year");
        if (year % 400 == 0) {
            System.out.println("this ia a leap year");
        } else System.out.println("this is not leap year");
    }
}


