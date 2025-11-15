// Count the number of elements in given array greater
// than a given number x.
import java.util.Scanner;

public class chw_12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

      
        System.out.print("Enter value of x: ");
        int x = sc.nextInt();

     
        int count = 0;
        for (int num : arr) {
            if (num > x) {
                count++;
            }
        }

        System.out.println("Number of elements greater than " + x + " = " + count);
    }
}
