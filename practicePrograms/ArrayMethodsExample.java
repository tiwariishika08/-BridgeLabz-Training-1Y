import java.util.Arrays;

public class ArrayMethodsExample {
    public static void main(String[] args) {
        // 1. Declare and initialize an array
        int[] numbers = {10, 5, 20, 15, 30, 25};
        System.out.println("Original array: " + Arrays.toString(numbers));

        // 2. Sort the array in ascending order
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // 3. Search for an element in the (sorted) array
        int key = 20;
        int index = Arrays.binarySearch(numbers, key);
        if (index >= 0) {
            System.out.println("Element " + key + " found at index: " + index);
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }

        // 4. Fill a new array with a specific value
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 100);
        System.out.println("Filled array: " + Arrays.toString(filledArray));

        // 5. Copy a portion of an array
        // Copies elements from index 1 to 3 (index 4 is exclusive)
        int[] copiedRange = Arrays.copyOfRange(numbers, 1, 4);
        System.out.println("Copied range (indices 1-3) of the sorted array: " + Arrays.toString(copiedRange));

        // 6. Compare two arrays
        int[] numbers2 = {5, 10, 15, 20, 25, 30};
        boolean areEqual = Arrays.equals(numbers, numbers2);
        System.out.println("Are the original array and the second array equal? " + areEqual);
    }
}
