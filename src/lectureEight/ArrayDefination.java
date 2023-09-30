package lectureEight;

public class ArrayDefination {

    public static void main(String[] args) {
        //Array- Collection of Similar data types of variables
        // index value store from 0
        // for loop use to print the all the value for arrow
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        //
        //
        String Studentname[] = {"Bhavin","Deep","Jahnvi"};
        int listNumber[] = {10,20,30,40,50};  // fixed in size, index value store from 0
                //index =    0  1  2  3  4
        System.out.println(listNumber[0]);
        System.out.println(listNumber[4]);

        System.out.println(listNumber.length);

        for(int i=0; i<=listNumber.length-1; i++){
            if (listNumber[i] == 30){
                System.out.println("position + "+ i);
            }
        }


    }
}
