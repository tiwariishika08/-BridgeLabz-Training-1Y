// Generic Box class
class Box<T> {
    private T value;

    // Set method
    public void set(T value) {
        this.value = value;
    }

    // Get method
    public T get() {
        return value;
    }
}

// Main class to test
public class Main {
    public static void main(String[] args) {

        // Integer Box
        Box<Integer> intBox = new Box<>();
        intBox.set(10);
        System.out.println("Integer: " + intBox.get());

        // String Box
        Box<String> strBox = new Box<>();
        strBox.set("Hello");
        System.out.println("String: " + strBox.get());

        // Double Box
        Box<Double> doubleBox = new Box<>();
        doubleBox.set(25.5);
        System.out.println("Double: " + doubleBox.get());
    }
}