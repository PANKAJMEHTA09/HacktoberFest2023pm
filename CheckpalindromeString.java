import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class checkpalindrome {
    public static boolean IsPalindrome(String st) {
        int n = st.length();
        char arr[] = new char[n];
        for (int i = 0; i < n; i++) {
            if (st.charAt(i) >= 'a' && st.charAt(i) <= 'z') {
                arr[i] = (char) (st.charAt(i) - 32);
            } else {
                arr[i] = st.charAt(i);
            }
        }
        int sp = 0;
        int ep = n - 1;
        while (sp < ep) {
            if (arr[sp] != arr[ep]) {
                return false;
            } else {
                sp++;
                ep--;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(IsPalindrome(st));

    }
}


