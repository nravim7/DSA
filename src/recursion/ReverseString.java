package recursion;

public class ReverseString {
    public static void main(String[] args) {
        String reversed = reversedString("Ravi");
        System.out.println(reversed);
    }

    private static String reversedString(String word) {
        return word.isEmpty()? word : (reversedString(word.substring(1)) + word.charAt(0));
    }
}
