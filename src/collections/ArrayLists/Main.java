package collections.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}*/

class StringComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o2.length() - o1.length();  //descending order
    }

    //
}

public class Main {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Hello", "World", "English");

        words.sort((a, b) -> b.length() - a.length());

        System.out.println(words);



    }
}



//System.out.println(list.get(1));
/*
        System.out.println(list.size());

        for (int numbers: list) {
        System.out.println(numbers);
        }

        System.out.println(list.contains(50));

         ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(80);

        list.add(2, 50);
        System.out.println(list);

        list.sort(new MyComparator());

        list.set(2, 40);
        System.out.println(list);

         int[] arr = new int[10];

         words.sort(new StringComparator());

        */
