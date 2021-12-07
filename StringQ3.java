
// Print all the duplicates in the input string
import java.util.*;

public class StringQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();// stores the input string
        ArrayList<Character> str = new ArrayList<>();// stores the repeated elemts
        ArrayList<Integer> c = new ArrayList<>();// stores the number of times it is repeated
        getString(sb, sc);// input the string
        getDuplicates(sb, str, c);// name is self-evident
        printResult(str, c);// again, self-evident
    }

    static void getString(StringBuilder sb, Scanner sc) {
        System.out.println("Enter string:");
        String s = sc.nextLine();
        sb.append(s);
    }

    static void getDuplicates(StringBuilder sb, ArrayList<Character> str, ArrayList<Integer> c) {
        int l = sb.length();
        int i, j;
        int count = 1;
        for (i = 0; i < l; i++) {
            // if the ith element is already counted then no need to count again
            // this somewhat helps the time complexity
            // 'By running another loop', ironic, I know..
            if (alreadyExists(sb.charAt(i), str)) {
                continue;
            } else {
                for (j = i + 1; j < l; j++) {
                    if (sb.charAt(i) == sb.charAt(j)) {
                        count++;
                    }
                }
                if (count > 1) {
                    str.add(sb.charAt(i));// stores the element that is repeated
                    c.add(count);// stortes the number of times it is repeated
                }
                count = 1;
            }
        }
    }

    static boolean alreadyExists(char ch, ArrayList<Character> str) {
        boolean result = false;
        int l = str.size();
        // checks if ch is present in str
        for (int i = 0; i < l; i++) {
            if (ch == str.get(i)) {
                result = true;
            }
        }
        return result;
    }

    static void printResult(ArrayList<Character> str, ArrayList<Integer> c) {
        // prints elements along with number of repetetions/repetations or whatever
        // vscode really needs autocorrect for my trashy spellings..
        int l = str.size();
        for (int i = 0; i < l; i++) {
            System.out.println(str.get(i) + " is repeated " + c.get(i) + " times");
        }
    }
}
// this algorithm has a bad space and time complexity
// I may re-do it later when I learn hashing and maps.
