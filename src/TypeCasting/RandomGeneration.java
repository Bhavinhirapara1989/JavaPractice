package TypeCasting;

import java.util.Random;

public class RandomGeneration {

    public static void main(String[] args) {

        Random random = new Random();
        int result = random.nextInt();
        String email = "bhavin"+result+"@gmail.com";

       String password = "Unicnumber"+result;
       creatUsers(email, password);

    }

    public static void creatUsers (String email, String password1) {

        System.out.println(email+" "+password1);

    }

}
