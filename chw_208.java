//  Write a program to print sum of all the elements of a
// 2D matrix.

class chw_208 {
    public static void main(String[] args) {
        int[][] a = {
            {4, 6, 2},
            {1, 9, 3},
            {7, 8, 5}
        };

        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                sum += a[i][j];
            }
        }

        System.out.println(sum);
    }
}
