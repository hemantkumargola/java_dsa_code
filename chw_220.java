//  Write an efficient algorithm that searches for a value target
// in an m x n integer matrix which has the following properties :
// ● Integers in each row are sorted in ascending from left to right.
// ● Integers in each column are sorted in ascending from top to
// bottom.


import java.util.Scanner;

public class chw_220 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        int target = sc.nextInt();

        int row = 0;
        int col = n - 1;

        boolean found = false;

        while(row < m && col >= 0){
            if(matrix[row][col] == target){
                found = true;
                break;
            }
            else if(matrix[row][col] > target){
                col--;
            }
            else{
                row++;
            }
        }

        if(found) System.out.println("Found");
        else System.out.println("Not Found");

        sc.close();
    }
}
