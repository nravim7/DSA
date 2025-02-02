package recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int fibonacciNumber = fibonacci(8);
        System.out.println(fibonacciNumber);

    }

    private static int fibonacci(int n) {
        if (n == 1 || n == 0) {
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }

}
