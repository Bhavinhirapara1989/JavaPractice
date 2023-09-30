package lectureElevan;

import java.util.HashMap;

public class HashMapCollection {
    public static void main(String[] args) {
        // HasMap -- key -value pair
        //         -- unorderd


        HashMap<String, String> names = new HashMap<>();
        names.put("First","Bhavin");
        names.put("Second","Nirav");
        names.put("Third","Kunal");
        names.put("Fourth","Piyush");
        System.out.println(names);
        System.out.println(names.get("Third"));


    }
}
