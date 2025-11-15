//  Given n string consisting of digits from 0 to 9. Return
// the string which has maximum value.

import java.util.Scanner;

public class chw_320 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] freq = new int[26];
        for (char ch : str.toCharArray()) {
            freq[ch - 'a']++;
        }
        int max = 0;
        char res = 'a';
        for (int i = 0; i < 26; i++) {
            if (freq[i] > max) {
                max = freq[i];
                res = (char) (i + 'a');
            }
        }
        System.out.println(res);
    }
}
