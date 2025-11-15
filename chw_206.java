//  Write a program to store roll number and marks
// obtained by 4 students side by side in a matrix.

public class chw_206 {
    public static void main(String[] args) {
        int[][] data = {
            {101, 85},
            {102, 78},
            {103, 92},
            {104, 67}
        };

        for (int i = 0; i < data.length; i++) {
            System.out.println("Roll: " + data[i][0] + "  Marks: " + data[i][1]);
        }
    }
}
