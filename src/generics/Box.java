package generics;

public class Box<T> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

class Main {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.setValue(1);


    }
}
