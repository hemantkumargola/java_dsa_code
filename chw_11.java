// Find the second largest element in the given Array.

public class chw_11 {
    public static void main(String[] args) {

        int[] arr = {12, 45, 7, 90, 34, 22};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > max) {
                secondMax = max;
                max = num;
            }
            else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        System.out.println("Second Largest = " + secondMax);
    }
}
