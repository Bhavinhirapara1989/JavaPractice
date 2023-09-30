package lactureSix;

import java.util.Locale;

public class PreDefineMethod {
    public static void main(String[] args) {
        String name = "Nhavin";
        String lastname = "Hirapara";
        System.out.println(name.toLowerCase()); //preDefined method
        System.out.println(name.toUpperCase());
        System.out.println(name.concat(name));
        System.out.println(name.length());
        System.out.println(lastname.length());
        System.out.println(name.isEmpty());
        System.out.println(name.replace('N','B'));

    }
}
