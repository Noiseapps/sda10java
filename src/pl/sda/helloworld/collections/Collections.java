package pl.sda.helloworld.collections;

import java.util.*;

public class Collections {

    public static void main(String[] args) {


        Integer[] ints = new Integer[]{1,2,3,4,5};
        List<Integer> integers = new ArrayList<>(Arrays.asList(ints));
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(null);
        integers.add(1, 50);
        integers.set(2, 25); // integers[2] = 25;
        int i3 = integers.get(1);

//        usuń z tablicy integers elementy zawierające się w tablicy strings2
        List<Integer> strings2 = new ArrayList<>();
        strings2.add(1);
        strings2.add(7);
        strings2.add(3);
        integers.removeAll(strings2);

//        do listy integers dodaj elementy z listy strings2
        integers.addAll(strings2);

//        usuń wsyzstkie elementy
//        integers.clear();

//        ilość elementów w liście
        integers.size();

//        pobierz element z listy
        integers.get(0);

        integers.contains(2);

        integers.isEmpty();

        integers.subList(2,4);

        integers.add(5);
        integers.add(5);
        integers.add(5);
        integers.add(5);

        System.out.println(integers);
        ArrayList<Integer> noDuplicates = new ArrayList<>(new HashSet<>(integers));
        System.out.println(noDuplicates);

//        int size = integers.size();
//        for (int i = 0; i < size; i++) {
//            Integer anInt = integers.get(i);
//            if(anInt == null || anInt %2 == 0) {
//                integers.remove(anInt);
//            }
//        }

//        for (Integer anInt : integers) {
//            if(anInt == null || anInt %2 == 0) {
//                integers.remove(anInt);
//            }
//        }

        ListIterator<Integer> iterator = integers.listIterator();
        System.out.println(integers);
        while (iterator.hasNext()) {
            Integer item = iterator.next();
            if(item == null || item %2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(integers);

//        autoboxing
        int i = new Integer(12);
        Integer i1 = 12;

        integers.sort(new IntComparator());

        integers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Math.abs(o1) - Math.abs(o2);
            }
        });
    }

    static class IntComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            return 0;
        }
    }

}
