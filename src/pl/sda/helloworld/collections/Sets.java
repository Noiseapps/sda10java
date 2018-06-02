package pl.sda.helloworld.collections;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {
        Set<String> stringSet= new HashSet<>();

        stringSet.add("adb");
        stringSet.contains("abc");
        stringSet.remove("adb");
        stringSet.isEmpty();
        stringSet.size();
        stringSet.clear();

    }
}
