package LinearSearch;

public class NumsWithEvenDigits {
    public static int findNumbers(int[] nums) {
        int even=0;
        for (int num : nums) {
            int n = num;
            int length = 0;

            while (n != 0) {
                n = n / 10;
                length += 1;
            }
            if (length % 2 == 0) {
                even += 1;
            }
        }
        return even;
    }

    public static void main(String[] args) {
        int[] arr={1,2345,7,23,34};
        System.out.println(findNumbers(arr));
    }
}
