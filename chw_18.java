//  Merge two sorted arrays
public class chw_18 {
    public static void main(String[] args) {

        int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6, 8, 10};

        int n = a.length, m = b.length;
        int[] c = new int[n + m];

        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        while (i < n) c[k++] = a[i++];
        while (j < m) c[k++] = b[j++];

        for (int x : c) {
            System.out.print(x + " ");
        }
    }
}
