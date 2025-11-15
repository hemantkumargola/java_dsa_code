//  Score after flipping matrix

import java.util.*;

public class chw_219 {
    public static void main(String[] args) {
        int[][] grid = {
            {0,0,1,1},
            {1,0,1,0},
            {1,1,0,0}
        };

        int rows = grid.length;
        int cols = grid[0].length;

        for(int i = 0; i < rows; i++) {
            if(grid[i][0] == 0) {
                for(int j = 0; j < cols; j++) {
                    grid[i][j] ^= 1;
                }
            }
        }

        for(int j = 0; j < cols; j++) {
            int count = 0;
            for(int i = 0; i < rows; i++) {
                if(grid[i][j] == 1) count++;
            }
            if(count * 2 < rows) {
                for(int i = 0; i < rows; i++) {
                    grid[i][j] ^= 1;
                }
            }
        }

        int score = 0;
        for(int i = 0; i < rows; i++) {
            int value = 0;
            for(int j = 0; j < cols; j++) {
                value = (value << 1) | grid[i][j];
            }
            score += value;
        }

        System.out.println(score);
    }
}
