// Given two strings s and t, return true if t is an anagram
// of s, and false otherwise.

import java.util.Arrays;
import java.util.Scanner;

public class chw_319 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        if (s.length() != t.length()) {
            System.out.println(false);
            return;
        }

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr1, arr2));
    }
}
