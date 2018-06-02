package pl.sda.helloworld.collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        Map<String, String> stringMap = new HashMap<>();

        stringMap.put("key", "value");
        stringMap.get("key");
        stringMap.containsKey("key");
        stringMap.containsValue("value");
        stringMap.keySet(); // zbiór kluczy
        stringMap.values(); // kolekcja wartości
        stringMap.size();
        stringMap.clear();
    }
}
