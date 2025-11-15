//  Return the total number of digits in a number without
// using any loop.
// Hint : Try using inbuilt Integer.toString() function.

import java.util.Scanner;

public class chw_314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(Integer.toString(num).length());
    }
}
