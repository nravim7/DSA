import java.util.Stack;

public class StackDS {

    public static void main(String[] args) {

        Stack<Integer> stack1 = new Stack<>();
        System.out.println(stack1.empty());
        stack1.push(34);
        stack1.push(35);
        stack1.push(36);
        stack1.push(37);
        stack1.push(38);
        System.out.println(stack1);
        stack1.pop();//LIFO
        System.out.println(stack1);
        System.out.println(stack1.peek());

    }
}
