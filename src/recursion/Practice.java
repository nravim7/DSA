package recursion;

public class Practice {

    static int[] arr = {12, 2, 30, 13, 5};

    public static void main(String[] args) {

        int value = sumOfDigits(arr.length - 1);
        System.out.println(value);
        int factValue = fact(0);
        System.out.println(factValue);
    }

    private static int fact(int n) {
        if (n == 1 || n==0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    private static int sumOfDigits(int n) {
        if (n == 0) {
            return arr[n];
        }

        return arr[n] + sumOfDigits(n - 1);

    }


}
