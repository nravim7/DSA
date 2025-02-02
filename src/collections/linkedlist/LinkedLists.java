package collections.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.get(2);
        linkedList.addFirst(0);
        linkedList.addLast(4);

        linkedList.getFirst();
        linkedList.getLast();
        System.out.println(linkedList);

        linkedList.removeIf(x -> x%2 == 0);
        System.out.println(linkedList);


        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat", "Dog", "Elephant"));
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Elephant", "Lion"));

        System.out.println(animals);

        animals.removeAll(animalsToRemove);
        System.out.println(animals);

    }
}
