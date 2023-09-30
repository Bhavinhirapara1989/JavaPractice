package lactureSix;

import java.util.Locale;

public class PreDefineMethodTwo {
    public static void main(String[] args) {
        String name = "Nivan";
        String lastname = "Hirapara";
        System.out.println(name.concat(lastname));
        System.out.println(lastname.concat(name.toUpperCase(Locale.ROOT)));
        System.out.println(name.concat(lastname.toUpperCase(Locale.ROOT)));
    }
}
