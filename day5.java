import java.util.*;

public class LeadersInArray {
    public static List<Integer> findLeaders(int[] arr) {
        int n = arr.length;
        List<Integer> leaders = new ArrayList<>();

        // Rightmost element is always a leader
        int maxFromRight = arr[n - 1];
        leaders.add(maxFromRight);

        // Traverse from second last to first
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                leaders.add(maxFromRight);
            }
        }

        // Since leaders were collected from right to left, reverse them
        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        List<Integer> result = findLeaders(arr);
        System.out.println("Leaders: " + result);
    }
}
