//  Take integer input and convert it into a String.

import java.util.Scanner;

public class chw_313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = Integer.toString(num);
        System.out.println("String: " + str);
    }
}
