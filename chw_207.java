//  Write a JAVA program to find the largest element of a
// given 2D array of integers.
public class chw_207 {
    public static void main(String[] args) {
        int[][] arr = {
            {4, 9, 2},
            {11, 3, 7},
            {5, 8, 6}
        };

        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        System.out.println("Largest element: " + max);
    }
}

