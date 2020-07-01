package org.example.morganstanley;

public class DivisibilityOfString {

    public int findSmallestDivisor(String s, String t) {


        if (isDivisible(s, t)) {
            return findSmallestStringToForm(s, t);
        }
        return -1;
    }

    // find after concatenating if the string is divisible
    private boolean isDivisible(String s, String t) {
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
    private int findSmallestStringToForm(String s, String t) {

        String substr = t.substring(0, (s + s).indexOf(s, 1));

        if (isDivisible(t, substr) && isDivisible(s, substr)) {
            return substr.length();
        }

        return -1;
    }

}
