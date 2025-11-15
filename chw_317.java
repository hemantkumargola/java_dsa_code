//  Input a string and toggle all the characters of it.
// (Replace small case with capital case & vice versa)

import java.util.Scanner;

public class chw_317 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (Character.isUpperCase(arr[i])) {
                arr[i] = Character.toLowerCase(arr[i]);
            } else if (Character.isLowerCase(arr[i])) {
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }
        String result = new String(arr);
        System.out.println(result);
    }
}
