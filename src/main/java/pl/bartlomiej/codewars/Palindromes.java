package pl.bartlomiej.codewars;

import java.util.ArrayList;

public class Palindromes {

    public static int longestPalindrome(final String s) {

        if (s.length() == 0) {

            return 0;

        } else {

            StringBuilder stringBuilder = new StringBuilder();

            ArrayList<String> arrayList = new ArrayList<>();

            String toArray;

            for (int i = 0; i < s.length(); i++) {

                for (int j = 0; j < s.length() - i; j++) {

                    toArray = String.valueOf(stringBuilder.append(s.charAt(i + j)));

                    arrayList.add(toArray);
                }

                stringBuilder = new StringBuilder();

            }

            String longest = "";

            for (int i = 0; i < arrayList.size(); i++) {
                StringBuilder revers = new StringBuilder();
                revers.append(arrayList.get(i));
                String findReverse = String.valueOf(revers.reverse());
                if ((arrayList.get(i)).equals(findReverse)) {

                    if (longest.length() < arrayList.get(i).length())
                        longest = arrayList.get(i);

                }


            }

            return longest.length();
        }

    }

}
