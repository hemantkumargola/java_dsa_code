// Find the doublet in the Array whose sum is equal to the given value x. (Two Sum)


public class chw_14 {
    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15, 5, 3};
        int x = 10;

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x) {
                    System.out.println("Doublet found: " + arr[i] + ", " + arr[j]);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No doublet found with sum = " + x);
        }
    }
}
