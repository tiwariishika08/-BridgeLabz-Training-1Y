class Pair<T, U> {
    private T first;
    private U second;

    // Constructor
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    // Get methods
    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }
}

// Test
class Main {
    public static void main(String[] args) {
        Pair<String, Integer> student = new Pair<>("Amol", 20);

        System.out.println("Name: " + student.getFirst());
        System.out.println("Age: " + student.getSecond());
    }
}