package pl.bartlomiej.codewars;



public class Palindromes {

    public static int longestPalindrome(final String s) {

        if (s.length() == 0) {

            return 0;

        } else {


            String longest = s.substring(0, 1);

            for (int i = 0; i < s.length() - 1; i++) {

                String palindrome = intermediatePalindrome(s, i, i);
                if (palindrome.length() > longest.length()) {
                    longest = palindrome;
                }

                palindrome = intermediatePalindrome(s, i, i + 1);
                if (palindrome.length() > longest.length()) {
                    longest = palindrome;
                }
            }

            return longest.length();

        }

    }


    static public String intermediatePalindrome(String s, int left, int right) {
        if (left > right) return null;
        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }

}