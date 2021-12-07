
//reverse a string
import java.util.*;

public class StringQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        getString(sb, sc);
        reverseString(sb);
        printString(sb);
    }

    static void getString(StringBuilder sb, Scanner sc) {
        System.out.println("Enter string:");
        String s = sc.nextLine();
        sb.append(s);
    }

    static void printString(StringBuilder sb) {
        System.out.println(sb);
    }

    static void reverseString(StringBuilder sb) {
        int l = sb.length() - 1;
        int low = 0;
        int high = l;
        char ch;
        while (low < high) {
            ch = sb.charAt(low);// swap
            sb.setCharAt(low, sb.charAt(high));
            sb.setCharAt(high, ch);
            low++;
            high--;
        }

    }
}