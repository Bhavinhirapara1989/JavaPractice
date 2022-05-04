package TypeCasting;

import java.util.Random;

public class RandomGeneration1 {
    public static void main(String[] args) {

        Random random = new Random();
        int result = random.nextInt();
        String password = "BMW" + result;
        newBank(password);
    }

    public static void newBank (String password1){
        System.out.println(password1);
    }
}
