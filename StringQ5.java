
//A Program to check if strings are rotations of each other or not
import java.util.*;

public class StringQ5 {
    static Scanner sc = null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        // storing the strings
        System.out.println("Enter first string:");
        String str1 = sc.nextLine();
        System.out.println("Enter second string: ");
        String str2 = sc.nextLine();
        boolean result = checkRotation(str1, str2);
        System.out.println(result);
    }

    static boolean checkRotation(String str1, String str2) {
        boolean result = false;
        String temp = str1.concat(str1);// joining first string with itself
        // checking if both strings are of same length and if the second string is a
        // substring of the concatenated string
        // indexOf function returns -1 if it is not a substring
        // otherwise it returns the index of its first occurence
        if (str1.length() == str2.length() && temp.indexOf(str2) != -1) {
            result = true;
        }

        return result;
    }

}
