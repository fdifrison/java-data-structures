package com.fdifrison.array.exercise;

import java.util.Arrays;

public class Anagrams {

    public static void main(String[] args) {
        var word = "restful".toCharArray();
        var anagram = "fluster".toCharArray();
        var isSolvedWithSort = solveWithSort(word, anagram);
        var isSolvedBrutally = solveBrutally(word, anagram);
        System.out.println(isSolvedWithSort && isSolvedBrutally ? "Is an anagram" : "Is not an anagram");
    }

    private static boolean solveWithSort(char[] s1, char[] s2) {
        if (s1.length != s2.length) return false;
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1, s2);
    }

    private static boolean solveBrutally(char[] s1, char[] s2) {
        if (s1.length != s2.length) return false;
        for (char w1 : s1) {
            int tentative = s1.length;
            for (char w2 : s2) {
                if (w2 != w1) {
                    tentative--;
                    if (tentative == 0) return false;
                }
            }
        }
        return true;
    }
}
