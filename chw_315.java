//  Input a string and Update all the even positions in the
// string to character ‘a’. Consider 0-based indexing.

import java.util.Scanner;

public class chw_315 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i += 2) {
            arr[i] = 'a';
        }
        String result = new String(arr);
        System.out.println(result);
    }
}
