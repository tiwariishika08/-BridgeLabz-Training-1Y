class Student {

    // 2. Instance variables
    int id;
    String name;
    int age;

    // 3. Method
    void display_details() {
        // 4. Local variable
        String status = "Active";

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Status: " + status);
    }

    public static void main(String[] args) {

        // 1 & 5. Class object creation
        Student s1 = new Student();

        // Assigning values
        s1.id = 101;
        s1.name = "Somesh";
        s1.age = 22;

        // 6. Method call
        s1.display_details();
    }
}
