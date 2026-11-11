package Hashmaps;
import java.util.*;
public class Second {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Kunal",99);
        map.put("Chinnu",100);
        map.put("Lux",100);

        System.out.println(map.get("Kunal"));
        System.out.println(map.getOrDefault("Apoorv",78)); //If the key not present then it will return the default value
        System.out.println(map.containsKey("Kunal")); //Checks whether key is present or not

        HashSet<Integer> set = new HashSet<>();
        set.add(56);
        set.add(26);
        set.add(23);
        set.add(26);

        System.out.println(set);

        TreeMap<String, Integer> tree = new TreeMap<>();
        tree.put("Kunal",99);
        tree.put("Chinnu",101);
        tree.put("Lux",100);

        System.out.println(tree);


    }
}
