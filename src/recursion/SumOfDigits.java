package recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int sum = sumOfAll(12345);
        System.out.println(sum);
    }

    private static int sumOfAll(int number) {
        if (number == 1)
            return number;

        return (number%10) + sumOfAll(number/10);
    }
}
