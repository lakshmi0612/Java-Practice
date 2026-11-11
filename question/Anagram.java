package question;

import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char [] listS=s.toCharArray();
        char[] listT=t.toCharArray();

        Arrays.sort(listS);
        Arrays.sort(listT);

        return Arrays.equals(listS,listT);


    }
}
