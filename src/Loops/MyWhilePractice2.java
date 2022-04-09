package Loops;

public class MyWhilePractice2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        String car [] = {"Honda", "BMW", "Toyota", "Mercedes", "Tesla","Range Rover"};

        for (int i = 3; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (String a:car) {
            System.out.println(a);
    }

    }
}
