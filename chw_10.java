// Find the maximum value out of all the elements in the
// array.

public class chw_10 {
    public static void main(String[] args) {

        int[] arr = {12, 45, 7, 90, 34, 22};

        int max = arr[0];  

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];   
            }
        }

        System.out.println("Maximum value = " + max);
    }
}
