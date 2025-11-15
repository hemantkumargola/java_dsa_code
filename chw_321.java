// Check if two strings are isomorphic
    import java.util.Scanner;
import java.util.HashMap;

public class chw_321 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        if (s.length() != t.length()) {
            System.out.println(false);
            return;
        }

        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i), c2 = t.charAt(i);
            if (mapST.containsKey(c1) && mapST.get(c1) != c2 ||
                mapTS.containsKey(c2) && mapTS.get(c2) != c1) {
                System.out.println(false);
                return;
            }
            mapST.put(c1, c2);
            mapTS.put(c2, c1);
        }
        System.out.println(true);
    }
}
