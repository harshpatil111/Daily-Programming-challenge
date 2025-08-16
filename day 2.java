public class MissingNumber {
    public static int findMissing(int[] arr, int n) {
        // Expected sum of numbers from 1 to n
        int totalSum = n * (n + 1) / 2;

        // Actual sum of given array
        int arrSum = 0;
        for (int num : arr) {
            arrSum += num;
        }

        // Missing number
        return totalSum - arrSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5}; // Example input
        int n = 5; // since numbers are from 1 to n
        System.out.println("Missing number: " + findMissing(arr, n));
    }
}
