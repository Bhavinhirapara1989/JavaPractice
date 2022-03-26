package IfElse;

public class PassFail {
    public static void main(String[] args) {

        checkStudentPassFail(60);
    }

    public static void checkStudentPassFail(int marks) {

        if (marks >= 40) {
            System.out.println("pass");
        }
        else if (marks <40){
            System.out.println("fail");}
        else if (marks >=60){
        System.out.println("first class");
        }
        else if (marks >=70){
        System.out.println("Distinction");}

    }


}
