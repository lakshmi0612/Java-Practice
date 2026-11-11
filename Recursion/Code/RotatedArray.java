package Code;

public class RotatedArray {

    public static void main(String[] args) {
        System.out.println("=== WHY WE CHECK arr[low] <= arr[middle] ===\n");

        // Example 1: Rotation point in right half
        int[] arr1 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Array 1: {4, 5, 6, 7, 0, 1, 2}");
        System.out.println("Original: {0, 1, 2, 4, 5, 6, 7} rotated right by 4 positions");
        analyzeArray(arr1, "Array 1");

        System.out.println();

        // Example 2: Rotation point in left half
        int[] arr2 = {6, 7, 0, 1, 2, 4, 5};
        System.out.println("Array 2: {6, 7, 0, 1, 2, 4, 5}");
        System.out.println("Original: {0, 1, 2, 4, 5, 6, 7} rotated right by 2 positions");
        analyzeArray(arr2, "Array 2");

        System.out.println();

        // Example 3: No rotation
        int[] arr3 = {0, 1, 2, 4, 5, 6, 7};
        System.out.println("Array 3: {0, 1, 2, 4, 5, 6, 7}");
        System.out.println("No rotation");
        analyzeArray(arr3, "Array 3");

        System.out.println("\n" + "=".repeat(60));
        System.out.println("THE KEY INSIGHT:");
        System.out.println("=".repeat(60));
        System.out.println("In a rotated sorted array, AT LEAST ONE HALF is always sorted!");
        System.out.println("We use arr[low] <= arr[middle] to identify WHICH half is sorted.");
        System.out.println("Once we know which half is sorted, we can do normal binary search logic on that half.");
    }

    static void analyzeArray(int[] arr, String name) {
        int low = 0;
        int high = arr.length - 1;
        int middle = low + (high - low) / 2;

        System.out.println("low=" + low + ", middle=" + middle + ", high=" + high);
        System.out.println("arr[low]=" + arr[low] + ", arr[middle]=" + arr[middle] + ", arr[high]=" + arr[high]);

        // Check the condition
        if (arr[low] <= arr[middle]) {
            System.out.println("arr[low] <= arr[middle] → " + arr[low] + " <= " + arr[middle] + " → TRUE");
            System.out.println("✓ LEFT HALF is sorted: {" + formatRange(arr, low, middle) + "}");
            System.out.println("? RIGHT HALF may or may not be sorted: {" + formatRange(arr, middle + 1, high) + "}");
        } else {
            System.out.println("arr[low] <= arr[middle] → " + arr[low] + " <= " + arr[middle] + " → FALSE");
            System.out.println("? LEFT HALF is NOT sorted: {" + formatRange(arr, low, middle) + "}");
            System.out.println("✓ RIGHT HALF is sorted: {" + formatRange(arr, middle + 1, high) + "}");
        }

        System.out.println("Visual representation:");
        visualizeArray(arr, low, middle, high);
    }

    static String formatRange(int[] arr, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end && i < arr.length; i++) {
            if (i > start) sb.append(", ");
            sb.append(arr[i]);
        }
        return sb.toString();
    }

    static void visualizeArray(int[] arr, int low, int middle, int high) {
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            if (i == low) System.out.print("[");
            System.out.print(arr[i]);
            if (i == middle) System.out.print("(M)");
            if (i == high) System.out.print("]");
            if (i < arr.length - 1) System.out.print(" ");
        }
        System.out.println();

        // Show which part is definitely sorted
        System.out.print("       ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[low] <= arr[middle]) {
                if (i >= low && i <= middle) {
                    System.out.print("↑");
                } else {
                    System.out.print(" ");
                }
            } else {
                if (i > middle && i <= high) {
                    System.out.print("↑");
                } else {
                    System.out.print(" ");
                }
            }
            if (i < arr.length - 1) System.out.print(" ");
        }
        System.out.println(" ← Sorted half");
        System.out.println();
    }
}

