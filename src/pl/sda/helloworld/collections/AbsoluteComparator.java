package pl.sda.helloworld.collections;

import java.util.ArrayList;
import java.util.List;

public class AbsoluteComparator {


    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(-5);
        integerList.add(1);
        integerList.add(-120);
        integerList.add(19);
        integerList.add(23);
        integerList.add(-34);
        integerList.add(-29);
        integerList.add(29);
        integerList.add(15);
        integerList.add(-50);
        integerList.add(-55);
        integerList.add(203);

        System.out.println(integerList);

        // todo sort

        System.out.println(integerList);
    }
}
