//  Push zeroes to end while maintaining the relative order
// of other elements.

public class chw_407 {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};
        int index = 0;

        for (int x : arr) {
            if (x != 0) {
                arr[index] = x;
                index++;
            }
        }

        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

        for (int x : arr) System.out.print(x + " ");
    }
}
