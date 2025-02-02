import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
//        System.out.println(list.get(0));
        list.add(80);

        list.add(2, 50);

//        for (int x: list) {
//            System.out.println(x);
//        }
        System.out.println(list.toString());
    }
}
