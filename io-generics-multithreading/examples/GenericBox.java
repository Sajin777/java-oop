class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

public class GenericBox {
    public static void main(String[] args) {
        Box<Integer> number = new Box<>();
        number.set(100);

        Box<String> text = new Box<>();
        text.set("Java");

        System.out.println(number.get());
        System.out.println(text.get());
    }
}
