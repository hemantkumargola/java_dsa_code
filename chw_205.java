public class chw_205 {
    public static void main(String[] args) {
        int[][] arr = {
            {3, 4, 5},
            {1, 2, 3},
            {7, 8, 9}
        };

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.println(sum);
        }
    }
}
