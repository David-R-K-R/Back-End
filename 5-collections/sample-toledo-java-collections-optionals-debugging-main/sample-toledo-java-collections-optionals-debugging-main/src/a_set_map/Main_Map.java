package a_set_map;

import java.util.HashMap;
import java.util.Map;

public class Main_Map {

    public static void main(String[] args) {
        // create Map with name as key and age as entry
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Amelia", 33);
        ages.put("Ben", 46);
        ages.put("Chris", 72);
        System.out.println(ages.size());

        ages.put("Chris", 34); // Chris is already in map, size does not change
        System.out.println(ages.size());

        // loop over keys
        for (String key : ages.keySet()) {
            System.out.println(key);// print key
            System.out.println(ages.get(key)); // get value corresponding to the key
        }

        // loop over values
        for (Integer age : ages.values()) {
            System.out.println(age); // print value
        }

        // loop over entries
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey()); // get key of the entry
            System.out.println(entry.getValue()); // get value of the entry
        }
    }
}
