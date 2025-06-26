package MultiThreading;

import java.util.HashMap;
import java.util.Map;

public class ThreadMethods {
    public static void main(String[] args) {

        String s = "    ";


        s = s.replaceAll(" ", "");

        String[] str = s.trim().split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();
        for (String temp : str) {
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }

        System.out.println(map);

        for (Map.Entry<String, Integer> i : map.entrySet()) {
            System.out.println(i.getKey() + " " + i.getValue());
        }
    }
}
