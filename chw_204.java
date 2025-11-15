public class chw_204 {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 25, 3},
            {45, 7, 8},
            {9, 11, 60}
        };

        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
