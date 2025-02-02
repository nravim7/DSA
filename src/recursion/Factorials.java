package recursion;

public class Factorials {

    public static void main(String[] args) {

        int value = factorialOf(5);
        System.out.println(value);
    }

    private static int factorialOf(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorialOf(n - 1);
    }
}
