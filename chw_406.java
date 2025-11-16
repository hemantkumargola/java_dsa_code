//  How much maximum swaps are needed to sort array of
// length 6 ?
public class chw_406 {

    public static void main(String[] args) {

        int[] arr = {6, 5, 4, 3, 2, 1};
        int swaps = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
        }

        System.out.println("Maximum swaps needed: " + swaps);
    }
}
