public class chw_203 {
    public static void main(String[] args) {
        int[][] arr = {
            {5, 6, 7},
            {2, 3, 4}
        };

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}

