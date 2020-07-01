package org.example.morganstanley;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DivisibilityOfStringTest {
    DivisibilityOfString divisibilityOfString;

    @Before
    public void setup() {
        divisibilityOfString = new DivisibilityOfString();
    }

    @Test
    public void test() {
        String s = "abcabc";
        String t = "abc";

        int actual = divisibilityOfString.findSmallestDivisor(s, t);

        Assert.assertTrue(actual == 3);
    }

    @Test
    public void testNoDivisibility() {
        String s = "abcabc";
        String t = "ab";

        int actual = divisibilityOfString.findSmallestDivisor(s, t);

        Assert.assertTrue(actual == -1);
    }

}