import java.util.Scanner;

public class BinarySearch_iterative {
    // Returns index of x if it is present in arr[].
    int binarySearch(int arr[], int x) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if x is present at mid
            if (arr[mid] == x)
                return mid;

            // If x greater, ignore left half
            if (arr[mid] < x)
                low = mid + 1;

            // If x is smaller, ignore right half
            else
                high = mid - 1;
        }
        // If we reach here, then element was not present
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearch_iterative ob = new BinarySearch_iterative();

        // Reading the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Declaring the array
        int arr[] = new int[n];

        // Reading array elements
        System.out.println("Enter the elements of the array in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Reading the element to be searched
        System.out.print("Enter the element to be searched: ");
        int x = scanner.nextInt();

        // Function call
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index " + result);

        // Closing the scanner
        scanner.close();
    }
}
