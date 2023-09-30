package lectureElevan;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetTopic {

    public static void main(String[] args) {

        HashSet<String> studentName = new HashSet<>(); // can't add duplicate value
        studentName.add("Nivan Hirapara");
        studentName.add("Kunal");
        studentName.add("Bhavin");
        studentName.remove("Kunal");
        System.out.println(studentName);

        LinkedHashSet<String> nextProdoct = new LinkedHashSet<>();
        nextProdoct.add("shirts");
        System.out.println(nextProdoct);


    }
}
