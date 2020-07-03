package org.example.practice.others;

import java.util.Arrays;

public class HurdleRace {
    static int hurdleRace(int k, int[] height) {
        int maxHurdleHeight = Arrays.stream(height).max().orElse(0);

        return maxHurdleHeight > k ? maxHurdleHeight - k : 0;
    }


    public static void main(String[] args) {


        int n = 5;

        int k = 2;

        int[] height = new int[n];


        int result = hurdleRace(k, height);


    }
}
