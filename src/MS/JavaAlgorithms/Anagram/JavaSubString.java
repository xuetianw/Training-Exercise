package MS.JavaAlgorithms.Anagram;

import java.util.HashSet;
import java.util.Set;

public class JavaSubString {

    public static void countSubstrings(String s) {
//        int i = 0;

        int count = 0;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            //case 1 when the result is odd number bab
            int iCopy = i;
            int j = iCopy + 2;
            while (iCopy >= 0 && j < s.length() && s.charAt(j) == s.charAt(iCopy)) {
                set.add(s.substring(iCopy, j + 1));
                iCopy--;
                j++;
            }
            // case 2 when the result is even number baab
            iCopy = i;
            j = iCopy + 1;
            if (j + 2 < s.length() && s.charAt(j) == s.charAt(j + 1)) {
                j = j + 2;
                while (iCopy >= 0 && j < s.length() && s.charAt(j) == s.charAt(iCopy)) {
                    set.add(s.substring(iCopy, j + 1));
                    iCopy--;
                    j++;
                }
            }
        }
        set.stream().forEach(x -> System.out.println(x));
    }

    public static void main(String[] args) {
        countSubstrings("ababba");
    }
}
