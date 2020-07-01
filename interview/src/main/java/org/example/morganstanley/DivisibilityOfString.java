package org.example.morganstanley;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

    public static int findSmallestDivisor(String s, String t) {


        if (isDivisible(s, t)) {
            return findSmallestStringToForm(s, t);
        }
        return -1;
    }

    // find after concatenating if the string is divisible
    private static boolean isDivisible(String s, String t) {
        int originalStringLength = s.length();
        String concatenatedString = "";
        do {
            concatenatedString = concatenatedString.concat(t);
            if (s.equalsIgnoreCase(concatenatedString)) {
                return true;
            }
        } while (originalStringLength >= concatenatedString.length());

        return false;
    }

    //finds length of smallest substring to make concatenation of both s and t
    private static int findSmallestStringToForm(String s, String t) {

        String substr = t.substring(0, (s + s).indexOf(s, 1));

        if (isDivisible(t, substr) && isDivisible(s, substr)) {
            return substr.length();
        }

        return -1;
    }

}

public class DivisibilityOfString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = "abcabc";

        String t = "abc";

        int result = Result.findSmallestDivisor(s, t);
        System.out.println(result);

        bufferedReader.close();
    }
}
