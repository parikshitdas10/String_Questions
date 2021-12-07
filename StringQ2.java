
//Given a string S, check if it is palindrome or not.
import java.util.*;

public class StringQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        getString(sb, sc);
        checkPalindrome(sb);
    }

    static void getString(StringBuilder sb, Scanner sc) {
        System.out.println("Enter string:");
        String s = sc.nextLine();
        sb.append(s);
    }

    static void checkPalindrome(StringBuilder sb) {
        int l = sb.length();
        int flag = 0;
        for (int i = 0; i < l / 2; i++) {
            if (sb.charAt(i) != sb.charAt(l - 1 - i)) {
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not Palindrome");
        }
    }
}
// this solution has O(1) space complexity
// and O(n) time complexity
// reversing the string to check palindrome will increase space complexity
