import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take inputs in centimeters
        System.out.print("Enter base in cm: ");
        float base = sc.nextFloat();

        System.out.print("Enter height in cm: ");
        float height = sc.nextFloat();

        // Area in square centimeters
        float areaSqCm = 0.5f * base * height;

        // Convert cm to inches (1 inch = 2.54 cm)
        float baseInInch = base / 2.54f;
        float heightInInch = height / 2.54f;

        // Area in square inches
        float areaSqIn = 0.5f * baseInInch * heightInInch;

        // Output
        System.out.println(
            "The Area of the triangle in sq in is " + areaSqIn +
            " and sq cm is " + areaSqCm
        );

        sc.close();
    }
}
