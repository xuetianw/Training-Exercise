package MS.JavaAlgorithms.Anagram.Leetcodd647;

class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int iCopy = i;
            int j = i + 1;     // when the substring is even length baab
            while (iCopy >= 0 && j < s.length() && s.charAt(iCopy--) == s.charAt(j++)) {
                count++;
            }
            j = iCopy = i;
            while (iCopy >= 0 && j < s.length() && s.charAt(iCopy--) == s.charAt(j++)) {
                count++;
            }
        }
        return count;
    }
}