package lectureElevan;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListTopic {

    public static void main(String[] args) {

        // Arralist --- Dyanamic,
        //Operation---
        ArrayList<String> nextProduct = new ArrayList<>();
        nextProduct.add("shirts");
        nextProduct.add("Tshirt");
        nextProduct.add("shoes");

        System.out.println(nextProduct);

        LinkedList<String> studentname = new LinkedList<>(); // Fast than arraylist
        studentname.add("bhavin");
        System.out.println(studentname);
    }
}
