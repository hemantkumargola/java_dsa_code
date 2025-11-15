//  Find the element ‘x’ in the array . Take array
// and x as input.

import java.util.Scanner;

public class chw_09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element x to search: ");
        int x = sc.nextInt();

        
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.println("Element " + x + " found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element " + x + " not found in the array.");
        }
    }
}
