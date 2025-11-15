//  Sort the array of 0’s and 1’s .

public class chw_16 {
    public static void main(String[] args) {

        int[] arr = {1, 0, 1, 0, 1, 0, 0, 1};

        int zeroCount = 0;

        for (int x : arr) {
            if (x == 0) zeroCount++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (i < zeroCount) arr[i] = 0;
            else arr[i] = 1;
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

