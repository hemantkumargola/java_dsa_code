public class chw_19 {
    public static void main(String[] args) {

        int[] arr = {4, 5, 2, 25, 7, 8};
        int n = arr.length;
        int[] nge = new int[n];

        for (int i = 0; i < n; i++) {
            int next = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    next = arr[j];
                    break;
                }
            }
            nge[i] = next;
        }

        for (int x : nge) {
            System.out.print(x + " ");
        }
    }
}
