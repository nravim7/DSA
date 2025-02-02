package generics;

import javax.swing.plaf.IconUIResource;
import java.util.List;

enum Operation {
    ADD, SUBTRACT, MULTIPLY, DIVIDE;


}

public class Test {
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4};
        String[] stringArray = {"Hello", "World"};
        printArray(intArray);
        printArray(stringArray);
    }

    public static <T> void printArray(T[] array) {
        for (T element: array) {
            System.out.println(element + " ");
        }
        System.out.println();
    }

    public static double sum(List<? extends Number> numbers) {
        double sum = 0;
        for (Number o: numbers) {
            sum += o.doubleValue();
        }
        return sum;
    }
}
