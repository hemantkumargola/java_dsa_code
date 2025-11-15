//  Reverse each word in a given sentence.
// (Ex : i am raghav garg -> i ma vahgar grag) I Il

import java.util.Scanner;

public class chw_318 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(new StringBuilder(word).reverse().toString()).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
