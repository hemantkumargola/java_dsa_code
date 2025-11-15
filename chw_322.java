// Maximum value string from n digit-strings
import java.util.Scanner;

public class chw_322 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String maxStr = "";
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            if (s.compareTo(maxStr) > 0) {
                maxStr = s;
            }
        }
        System.out.println(maxStr);
    }
}
