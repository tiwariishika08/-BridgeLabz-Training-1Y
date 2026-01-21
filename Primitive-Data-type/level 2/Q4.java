import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input in feet
        System.out.print("Enter distance in feet: ");
        float distanceInFeet = sc.nextFloat();

        // Conversion
        float distanceInYards = distanceInFeet / 3;
        float distanceInMiles = distanceInYards / 1760;

        // Output
        System.out.println(
            "The distance in yards is " + distanceInYards +
            " while the distance in miles is " + distanceInMiles
        );

        sc.close();
    }
}
