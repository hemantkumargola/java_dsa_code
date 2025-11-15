//  Given an integer ‘numRows’, generate Pascal's
// triangle.
public class chw_217 {
    public static void main(String[] args) {
        int numRows = 5;
        int[][] pascal = new int[numRows][];

        for (int i = 0; i < numRows; i++) {
            pascal[i] = new int[i + 1];
            pascal[i][0] = 1;
            pascal[i][i] = 1;

            for (int j = 1; j < i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < pascal[i].length; j++) {
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
    }
}
