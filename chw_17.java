//  Sort the array of 0’s , 1’s and 2’s . (Dutch Flag Algorithm)

public class chw_17 {
    public static void main(String[] args) {

        int[] arr = {2, 0, 1, 2, 1, 0, 0, 2};

        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
